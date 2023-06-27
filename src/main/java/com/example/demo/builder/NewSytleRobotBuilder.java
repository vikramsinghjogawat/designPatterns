package com.example.demo.builder;

public class NewSytleRobotBuilder implements RobotBuilder{

    RobotImpl robotImpl;

    public NewSytleRobotBuilder(){
        robotImpl = new RobotImpl();
    }

    @Override
    public void buildHead() {
        robotImpl.setRobotHead("Googles");
    }

    @Override
    public void buildTorso() {
        robotImpl.setRobotTorso("Garbage Collector Box");
    }

    @Override
    public void buildHands() {
        robotImpl.setRobotHands("Clippers");
    }

    @Override
    public void buildLegs() {
        robotImpl.setRobotLegs("Chain tracks");
    }

    @Override
    public RobotImpl getRobot() {
        return robotImpl;
    }


}
