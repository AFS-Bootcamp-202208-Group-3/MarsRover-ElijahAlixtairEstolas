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
            case "N":
                bearing = 0;
                break;
            case "E":
                bearing = 90;
                break;
            case "S":
                bearing = 180;
                break;
            case "W":
                bearing = 270;
                break;
        }
    }

    public MarsRover executeCommand(String command){
        switch(command){
            case "L":
                turnLeft(command);
                break;
            case "R":
                turnRight(command);
                break;
            case "M":
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
            case "S":
                locationY-=1;
                break;
            case "N":
                locationY+=1;
                break;
            case "E":
                locationX+=1;
                break;
            case "W":
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
