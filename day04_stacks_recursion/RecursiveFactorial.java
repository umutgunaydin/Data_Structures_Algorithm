package day04_stacks_recursion;

public class RecursiveFactorial {

    public static int factorial(int n){
        if(n<=1){//base condition
            return 1;
        }else{// recursive part
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
