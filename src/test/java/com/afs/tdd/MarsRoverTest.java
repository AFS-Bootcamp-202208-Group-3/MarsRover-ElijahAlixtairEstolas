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
    @Test
    void should_turn_west_when_executeCommand_given_L_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,WEST);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }
    @Test
    void should_turn_north_when_executeCommand_given_L_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,EAST);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,NORTH);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }
    @Test
    void should_turn_south_when_executeCommand_given_L_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,WEST);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }
    @Test
    void should_turn_south_when_executeCommand_given_R_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,EAST);
        String command = RIGHT;
        MarsRover expectedMarsRover = new MarsRover(0,0,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }
    @Test
    void should_move_south_when_executeCommand_given_south_direction_and_move_command() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,SOUTH);
        String command = RIGHT;
        MarsRover expectedMarsRover = new MarsRover(0,1,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeCommand(command);
        //then
        assertTrue(expectedMarsRover.equals(actualMarsRover));
    }

}
