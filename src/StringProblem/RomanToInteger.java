package StringProblem;

import java.util.HashMap;

// @author: Kaushik Banerjee
// Problem: https://leetcode.com/problems/roman-to-integer/
// Problem Statement: Given a roman numeral, convert it to an integer.
// The input is guaranteed to be within the range from 1 to 3999.
// The Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        int preValue=0;
        for(int i=s.length()-1;i>=0;i--){
            int currentValue = map.get(s.charAt(i));
            sum += (currentValue < preValue) ? -currentValue : currentValue;
            preValue = currentValue;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(romanToInt("MCMXCIV"));
    }
}
