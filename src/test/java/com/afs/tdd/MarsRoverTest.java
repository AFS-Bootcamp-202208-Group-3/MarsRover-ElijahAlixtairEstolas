package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MarsRoverTest {
    String EAST = "E";
    String LEFT = "L";
    String SOUTH = "S";
    @Test
    void should_turn_east_when_executeCommand_given_L_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,SOUTH);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,EAST);
        //when
        actualMarsRover = actualMarsRover.executeCommand(LEFT);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }

}
