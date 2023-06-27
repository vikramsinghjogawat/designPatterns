package com.example.demo.builder;

public class RobotImpl implements RobotPlan{

    private String head;
    private String torso;
    private String hands;
    private String legs;
    public String getRobotHead(){return head;}
    public String getRobotTorso(){return torso;}
    public String getRobotHands(){return hands;}
    public String getRobotLegs(){return legs;}

    @Override
    public void setRobotHead(String head) {
        this.head=head;
    }
    @Override
    public void setRobotTorso(String torso) {
        this.torso=torso;
    }
    @Override
    public void setRobotHands(String hands) {
        this.hands=hands;
    }
    @Override
    public void setRobotLegs(String legs) {
        this.legs=legs;
    }

}
