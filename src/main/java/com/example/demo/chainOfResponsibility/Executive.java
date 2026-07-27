package com.example.demo.designPatterns.chainOfResponsibility;

public class Executive implements RequestHandler{
    public Executive(RequestHandler handler) {
        this.handler = handler;
    }

    RequestHandler handler;

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL2")){
            //send request to executive and send appropriate response
            issue.setStatus("SOLVED");
            System.out.println("Request Handled by Executive");
        }else{
            System.out.println("Executive cannot handle.Forwarding to TechTeam");
            issue.setStatus("UNSOLVED,FORWARDED");
            handler.handleRequest(issue);
        }
    }
}
