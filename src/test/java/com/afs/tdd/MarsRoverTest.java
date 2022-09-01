package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static com.afs.tdd.Constants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MarsRoverTest {
    @Test
    void should_turn_east_when_executeCommand_given_L_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,SOUTH);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,EAST);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }

}
