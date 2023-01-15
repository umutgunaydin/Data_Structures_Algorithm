package day02_collectionsReview;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(indexOfFirstUniqueChar("loveleetcode"));
    }

    public static int indexOfFirstUniqueChar(String str) {

        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {  // time complexity O(n)
            Character each = str.charAt(i);
            if (charMap.containsKey(each)) {
                charMap.put(each,-1);
            }else{
                charMap.put(each, i);
            }
        }

        for (Integer eachValue : charMap.values()) {
            if (eachValue!=-1){
                return eachValue;
            }
        }
        return -1;
    }
}
