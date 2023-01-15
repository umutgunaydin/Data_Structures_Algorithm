package day02_collectionsReview;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        // create map
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"jack");
        studentsMap.put(2,"julia");
        studentsMap.put(3,"mike");

        System.out.println("printing the first non repeating character");
        String str="Java Developer";
        System.out.println(firstNonRepeatingCharacter(str));





    }

    public static Character firstNonRepeatingCharacter(String str){
        Map<Character,Integer> charMap=new HashMap<>();

        // count the frequency of chars
        for (int i = 0; i < str.length(); i++) {
            if (charMap.containsKey(str.charAt(i))){
                charMap.put(str.charAt(i),charMap.get(str.charAt(i))+1);
            }else {
                charMap.put(str.charAt(i),1);
            }
        }
        // check the character with the frequency of 1
        for (char eachChar : str.toCharArray()) {
            if (charMap.get(eachChar)==1){
                return eachChar;
            }
        }
        return null;
    }
}
