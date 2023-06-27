package com.example.demo.builder;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {



		RobotBuilder newSytleRobotBuilder = new NewSytleRobotBuilder();

		RobotEngineer robotEngineer = new RobotEngineer(newSytleRobotBuilder);

		robotEngineer.makeRobot();
		RobotImpl first = robotEngineer.getRobot();
		System.out.println("Name : Wall-e");
		System.out.println("Head :"+first.getRobotHead());
		System.out.println("Torso :"+first.getRobotTorso());

		System.out.println("Hands :"+first.getRobotHands());

		System.out.println("Legs :"+first.getRobotLegs());


	}



}