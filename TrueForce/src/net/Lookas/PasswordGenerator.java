package net.Lookas;

import java.util.Random;

public class PasswordGenerator {
    private final char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!§$%&/()=?´'`+*~#}][{@-_.:,;".toCharArray();
    public final String password;
    public PasswordGenerator(int length){
        this.password =  generatePassword(length);
    }
    private String generatePassword(int length){
        StringBuilder SB = new StringBuilder();
        for(int x = 0; x<length; x++){
            int rnd = -1;
            while (rnd < 0){
                rnd = new Random().nextInt(characters.length);
            }
            SB.append(characters[rnd%characters.length]);
        }
        return SB.toString();
    }
}
