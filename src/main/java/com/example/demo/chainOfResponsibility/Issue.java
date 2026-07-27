package com.example.demo.designPatterns.chainOfResponsibility;

public class Issue {
    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    private  String  priority;
    private String  status;

    public Issue(String priority, String status) {
        this.priority = priority;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }
}
