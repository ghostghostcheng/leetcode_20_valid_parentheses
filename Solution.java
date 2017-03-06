package leetcode_20_valid_parentheses;

import java.util.LinkedList;

public class Solution {
    public static boolean isValid(String s) {
        
        LinkedList<Character> charList = new LinkedList<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{') {
                charList.add(c);
            } else if(c == ')') {
                if(charList.isEmpty() || charList.getLast() != '(') {
                    return false;
                } else {
                    charList.removeLast();
                }
            } else if(c == ']') {
                if(charList.isEmpty() || charList.getLast() != '[') {
                    return false;
                } else {
                    charList.removeLast();
                }
            } else if(c == '}') {
                if(charList.isEmpty() || charList.getLast() != '{') {
                    return false;
                } else {
                    charList.removeLast();
                }
            }
        }
        
        return charList.isEmpty();
    }
}
