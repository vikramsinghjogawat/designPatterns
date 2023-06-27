package com.example.demo.builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot(){
        this.robotBuilder.buildHead();
        this.robotBuilder.buildTorso();
        this.robotBuilder.buildHands();
        this.robotBuilder.buildLegs();
    }

    public RobotImpl getRobot(){
        return this.robotBuilder.getRobot();
    }
}
