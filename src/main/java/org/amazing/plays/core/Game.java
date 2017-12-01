package org.amazing.plays.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.amazing.plays.entity.Board;
import org.amazing.plays.entity.Door;
import org.amazing.plays.entity.End;
import org.amazing.plays.entity.Ghost;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    private String uid;
    private Board board;
    private List<Ghost> ghosts;
    private List<Door> doors;
    private End end;
}
