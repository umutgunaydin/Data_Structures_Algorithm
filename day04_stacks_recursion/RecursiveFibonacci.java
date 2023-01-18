package day04_stacks_recursion;

public class RecursiveFibonacci {

    public static int fibonacci(int n){
        if (n==2){// termination
            return 1;
        } else if (n<=1) { //termination
            return 0;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }
}
