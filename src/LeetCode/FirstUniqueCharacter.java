package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i), 2);
            }
            else{
                hashmap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(hashmap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "shreyas";
        System.out.println(firstUniqChar(s));
    }
}
