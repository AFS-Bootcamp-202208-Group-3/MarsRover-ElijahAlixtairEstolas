package com.afs.tdd;

import static com.afs.tdd.Constants.*;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;
    private int bearing;


    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
        determineBearing();
    }

    private void determineBearing() {
        switch (direction){
            case NORTH:
                bearing = 0;
                break;
            case EAST:
                bearing = 90;
                break;
            case SOUTH:
                bearing = 180;
                break;
            case WEST:
                bearing = 270;
                break;
        }
    }

    public MarsRover executeBatchCommands(String commands){
        char charCommands[] = commands.toCharArray();
        for (char command: charCommands) {
            executeCommand(String.valueOf(command));
            //Arrays.asList(commands.split("");
        }
        return this;
    }

    private MarsRover executeCommand(String command){
        System.out.println(command);
        switch(command){
            case LEFT:
                turnLeft(command);
                break;
            case RIGHT:
                turnRight(command);
                break;
            case MOVE:
                move();
                break;
        }
        return this;
    }

    private String turnLeft(String command) {
        changeDirection(command);
        return direction;
    }
    private String turnRight(String command) {
        changeDirection(command);
        return direction;
    }

    private void move() {
        switch(direction){
            case SOUTH:
                locationY-=1;
                break;
            case NORTH:
                locationY+=1;
                break;
            case EAST:
                locationX+=1;
                break;
            case WEST:
                locationX-=1;
                break;
        }
    }

    private void changeDirection(String command) {
        changeBearing(command);
        determineDirection();
    }

    private void determineDirection() {
        switch(bearing){
            case 0:
                direction = NORTH;
                break;
            case 90:
                direction = EAST;
                break;
            case 180:
                direction = SOUTH;
                break;
            case 270:
                direction = WEST;
                break;
        }
    }

    private void changeBearing(String command) {
        if(command.equals(LEFT)) {
            bearing -= 90;
            if (bearing == -90)
                bearing = 270;
        }else if(command.equals(RIGHT)){
            bearing +=90;
            if(bearing == 360)
                bearing = 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        MarsRover marsRover = (MarsRover) obj;
        return this.direction.equals(marsRover.direction) &&
                this.locationY == marsRover.locationY &&
                this.locationX == marsRover.locationX;
    }
}
