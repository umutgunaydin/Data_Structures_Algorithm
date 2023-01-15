package day02_collectionsReview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> studentSet=new HashSet<>();

        //2. add elements
        studentSet.add(new Student(1, "jack"));
        studentSet.add(new Student(2, "julia"));
        studentSet.add(new Student(3, "mike"));
        studentSet.add(new Student(4, "mary"));
        studentSet.add(new Student(2, "julia"));// this returns false because set does not allow duplicates

        System.out.println(studentSet);

        System.out.println("printing first repeating character");
        String str="Java Developer";
        System.out.println(firstRepeatingChar(str));


    }

    public static Character firstRepeatingChar(String str){
        Set<Character> characterSet=new HashSet<>(); // space complexity of O(n)

        //iterate over str and add chars into hashSet
        for (int i = 0; i < str.length(); i++) {
            // if add ops is false return that character
            if (!characterSet.add(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
