package org.amazing.plays.rest;


import org.amazing.plays.dto.CommunicationDTO;
import org.amazing.plays.dto.DirectionEnum;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestApp {

    private final String MOVE = "move";
    private DirectionEnum directionEnum;
    private Map<String, String> credentialsMap;

    @PostConstruct
    public void setup(){
        credentialsMap = new HashMap<>();
        credentialsMap.put("name", "Ismael Rodriguez Garcia");
        credentialsMap.put("email", "ismael.rodriguez@ext.privalia.com");

    }

    @Path("/move")
    @POST
    public Map<String, String> move(final CommunicationDTO gameInfo){

        directionEnum = DirectionEnum.right;

        return Collections.singletonMap(MOVE, directionEnum.name());
    }


    @Path("/name")
    @POST
    public Map<String, String> name(final CommunicationDTO gameInfo){

        return credentialsMap;
    }
}
