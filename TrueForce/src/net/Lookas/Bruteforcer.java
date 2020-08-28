package net.Lookas;

import java.util.Arrays;

public class Bruteforcer {
    private static final char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!§$%&/()=?´'`+*~#}][{@-_.:,;".toCharArray();
    public static String Force(char[] input){
        char[] clearText = new char[input.length];
        int clearLength = 0;
        while (clearLength < input.length-1){
            for(Character c : characters){
                if(input[clearLength] == c){
                    clearText[clearLength] = c;
                    clearLength++;
                }
            }
        }
        String output = "";
        for(Character c : clearText){
            output += c;
        }
        return output;
    }
}
