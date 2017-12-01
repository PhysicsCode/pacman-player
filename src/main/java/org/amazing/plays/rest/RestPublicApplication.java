package org.amazing.plays.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Component
@ApplicationPath("/pacman/")
public class RestPublicApplication extends Application {
}
