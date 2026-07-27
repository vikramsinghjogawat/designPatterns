package com.example.demo.designPatterns.chainOfResponsibility;

public class TechTeam implements RequestHandler{

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL3")){
            //call tech team api  and send appropriate response
            System.out.println("Request Handled by TechTeam");
            issue.setStatus("SOLVED");
        }else{
            System.out.println("Tech team :Issue not resolved.");
            issue.setStatus("UNSOLVED");

        }
    }
}
