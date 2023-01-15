package day02_collectionsReview;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        // add elements to ArrayList
        students.add(new Student(1, "jack"));
        students.add(new Student(2, "julia"));
        students.add(new Student(3, "mike"));
        students.add(new Student(4, "mary"));

        //iteration on Arraylist
        //1. for loop with get()
        System.out.println("printing with for loop......");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        //2.iterator
        System.out.println("printing with iterator");
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //backwards iteration
        System.out.println("printing backwards with iterator.....");
        while (((ListIterator<Student>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<Student>) iterator).previous());
        }

        //3. forEach loop
        System.out.println("printing with forEach loop....");
        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }

        //4. lambda
        System.out.println("printing with lambda........");
        students.forEach(student -> System.out.println(student));

        //sorting elements in list by using comparator interface
        System.out.println("sorting with comparator interface by Id Desc.........");
        Collections.sort(students,new sortByIdDesc());
        students.forEach(student -> System.out.println(student));

        //sorting elements in list by using comparator interface
        System.out.println("sorting with comparator interface by name Desc.........");
        Collections.sort(students,new sortByNameDesc());
        students.forEach(student -> System.out.println(student));

    }

    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
