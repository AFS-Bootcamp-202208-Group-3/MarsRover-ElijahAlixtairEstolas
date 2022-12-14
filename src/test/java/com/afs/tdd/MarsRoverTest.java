package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static com.afs.tdd.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MarsRoverTest {
    @Test
    void should_turn_east_when_executeBatchCommands_given_L_command_given_0_0_SOUTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,SOUTH);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,EAST);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);

    }
    @Test
    void should_turn_west_when_executeBatchCommands_given_L_command_given_0_0_NORTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,WEST);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_turn_north_when_executeBatchCommands_given_L_command_given_0_0_EAST() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,EAST);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,NORTH);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_turn_south_when_executeBatchCommands_given_L_command_given_0_0_WEST() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,WEST);
        String command = LEFT;
        MarsRover expectedMarsRover = new MarsRover(0,0,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_turn_south_when_executeBatchCommands_given_R_command_given_0_0_EAST() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,EAST);
        String command = RIGHT;
        MarsRover expectedMarsRover = new MarsRover(0,0,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_move_south_when_executeBatchCommands_given_south_direction_and_move_command_given_0_0_SOUTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,SOUTH);
        String command = MOVE;
        MarsRover expectedMarsRover = new MarsRover(0,-1,SOUTH);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_move_north_when_executeBatchCommands_given_north_direction_and_move_command_given_0_0_NORTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        String command = MOVE;
        MarsRover expectedMarsRover = new MarsRover(0,1,NORTH);
        //when
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_execute_left_then_move_commands_when_executeBatchCommands_given_turn_and_move_command_given_0_0_NORTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        MarsRover expectedMarsRover = new MarsRover(-1,0,WEST);
        String command = LEFT;
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        command = MOVE;
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_execute_right_then_move_commands_when_executeBatchCommands_given_turn_and_move_command_given_0_0_NORTH() {
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        MarsRover expectedMarsRover = new MarsRover(1,0,EAST);
        String command = RIGHT;
        actualMarsRover = actualMarsRover.executeBatchCommands(command);
        command = MOVE;
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }

    @Test
    void should_execute_move_when_executeBatchCommands_given_move_command_given_0_0_NORTH(){
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        MarsRover expectedMarsRover = new MarsRover(0,1,NORTH);
        String command = MOVE;
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_execute_move_then_turn_right_when_executeBatchCommands_given_move_and_turn_command_given_0_0_NORTH(){
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        MarsRover expectedMarsRover = new MarsRover(0,1,EAST);
        String command = MOVE;
        actualMarsRover.executeBatchCommands(command);
        command = RIGHT;
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }


    @Test
    void should_execute_move_then_turn_right_when_executeBatchCommands_given_move_and_turn_commands_combined_given_0_0_NORTH(){
        //given
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        MarsRover expectedMarsRover = new MarsRover(0,1,EAST);
        String command = MOVE+RIGHT;
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }
    @Test
    void should_execute_combined_moves_when_executeBatchCommands_given_commands_combined_given_0_0_NORTH(){
        //given
        MarsRover expectedMarsRover= new MarsRover(0,-5,EAST);
        MarsRover actualMarsRover = new MarsRover(0,0,NORTH);
        String command = "MRRMMMMMML";
        actualMarsRover.executeBatchCommands(command);
        //then
        assertEquals(expectedMarsRover, actualMarsRover);
    }

}
