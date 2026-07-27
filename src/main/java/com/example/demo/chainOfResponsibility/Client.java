package com.example.demo.designPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Issue issue = new Issue("LEVEL3","INITIALTED");

        RequestHandler requestHandler = new ChatBot(new Executive(new ChatBot(new TechTeam())));
        requestHandler.handleRequest(issue);

    }
}
