package com.example.demo.builder;

public class OldStyleRobotBuilder implements RobotBuilder{

    private RobotImpl robotImpl;

    public OldStyleRobotBuilder(){
        this.robotImpl = new RobotImpl();
    }
    @Override
    public void buildHead() {
        robotImpl.setRobotHead("Dual Head");
    }

    @Override
    public void buildTorso() {
        robotImpl.setRobotTorso("Giant Chest");
    }

    @Override
    public void buildHands() {
        robotImpl.setRobotHands("4 hands");
    }

    @Override
    public void buildLegs() {
        robotImpl.setRobotLegs("Skinny Long legs");
    }

    @Override
    public RobotImpl getRobot() {
        return robotImpl;
    }


}
