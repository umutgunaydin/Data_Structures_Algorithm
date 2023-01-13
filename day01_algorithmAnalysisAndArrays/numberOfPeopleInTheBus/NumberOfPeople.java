package day01_algorithmAnalysisAndArrays.numberOfPeopleInTheBus;

public class NumberOfPeople {

    public static void main(String[] args) {

        int[][] numbers={{10,0},{3,5},{2,5}};
        System.out.println(numberOfPeople(numbers));
    }


    public static int numberOfPeople(int[][] array){ // complexity O(n)
        int number=0;
        for (int i = 0; i < array.length; i++) {
            number+=array[i][0];
            number-=array[i][1];
        }
        return number;
    }
}
