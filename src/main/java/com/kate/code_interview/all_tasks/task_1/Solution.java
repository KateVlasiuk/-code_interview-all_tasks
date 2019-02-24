package com.kate.code_interview.all_tasks.task_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

//1.1

    public boolean isUnique(String s) {
        Map<Character, Integer> uniMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (uniMap.getOrDefault(s.charAt(i),0) == 0) uniMap.put(s.charAt(i), 1);
            else return false;
        }
        return true;
    }
    public boolean isUniWithout(String s){
        for( int i = 0; i < s.length(); i++){
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s)) return false;
        }
        return true;
    }

    public boolean isUniNlogN(String s){
        char [] charArr = new char[s.length()];
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] == charArr[i+1]) return false;
        }
        return true;
    }
}
