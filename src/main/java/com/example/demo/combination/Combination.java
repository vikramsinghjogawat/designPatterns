package com.example.demo.combination;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();

        int[] nums = {1,2,3};
        res.add(new ArrayList<>());// Initially adding a new empty array
        for(int num:nums){
            int size = res.size();// taking note of the number of existing subsets in the res and then iterating
            for(int i=0;i<size;i++){
                List<Integer> newSubset = new ArrayList<>(res.get(i));//Everytime we pick the older subsets and add our new number
                newSubset.add(num);
                res.add(newSubset);
            }
        }
        System.out.println(res);// [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }
}
