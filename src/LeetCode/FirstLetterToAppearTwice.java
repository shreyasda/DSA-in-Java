package LeetCode;

import java.util.ArrayList;

public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        ArrayList<Character> characters = new ArrayList<>();
        for(char c: s.toCharArray()){
            if(characters.contains(c)){
                return c;
            }
            else{
                characters.add(c);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String string = "abacba";
        System.out.println(repeatedCharacter(string));
    }
}
