package com.example.demo.builder;

public interface RobotBuilder {

    void buildHead();
    void buildTorso();
    void buildHands();
    void buildLegs();
    RobotImpl getRobot();



}
