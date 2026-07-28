package com.example.demo.designPatterns.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //using backtracking
    public static void main(String[] args) {
        String input = "abc";
        List<String > res = new ArrayList<>();
        permute(res,"",input);
        System.out.println(res);// [abc, acb, bac, bca, cab, cba]
    }
        // IP->"abc", OP->""
    private static void permute(List<String> res, String current, String remaining) {
        if(remaining.isEmpty()){
            res.add(current);
            return;
        }
        for(int i=0;i<remaining.length();i++){
            String newRemaining =remaining.substring(0,i)+remaining.substring(i+1);
            permute(res,current+remaining.charAt(i),newRemaining);
        }
    }
}
