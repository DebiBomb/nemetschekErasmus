package nemetschekErasmus;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args){

        System.out.println((isPalindrome(121)));
    }  
    
    static public boolean isPalindrome(int x) {

        if(x < 0)
            return false;

        String xinString = Integer.toString(x);
        List<Character> chars = new ArrayList<>();

        for (char ch : xinString.toCharArray()) {
            chars.add(ch);
        }

        System.out.println(chars);
        int n = 0;
        for (int i=0; i<chars.size()-1; i++){

            if(chars.get(i) == chars.get((chars.size()-1)-i))
                n++;
            else
                return false;
        } 
        if(n == chars.size()-1)
            return true;
        
        return false;
    }
}