package com.example.demo.designPatterns.chainOfResponsibility;

public class ChatBot implements RequestHandler{
    RequestHandler handler ;

    public ChatBot(RequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL1")){
            //call chatbot service and send appropriate response
            issue.setStatus("SOLVED");
            System.out.println("Request Handled by chatbot");
        }else{
            System.out.println("Chatbot cannot handle.Forwarding to Executive");
            issue.setStatus("UNSOLVED,FORWARDED");
            handler.handleRequest(issue);
        }
    }
}
