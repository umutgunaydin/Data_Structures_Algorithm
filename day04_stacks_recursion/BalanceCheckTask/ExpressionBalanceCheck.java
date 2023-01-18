package day04_stacks_recursion.BalanceCheckTask;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(a*c)+{v-m}"));

        System.out.println(balanceCheck("(a-b)*9)"));


    }

    public static boolean balanceCheck(String expression){

        //create a stack
        Deque<Character> symbolStack=new LinkedList<>();

        //iterate over expression
        for (int i = 0; i < expression.length(); i++) {
            Character each=expression.charAt(i);
            // filter non-player chars
            if (each!='(' && each!='['&& each!='{'&& each!=')'&& each!=']'&& each!='}' )continue;
            // if it is a symbol tobe processed
                //if opening symbol push it to the stack
            if (each=='(' || each=='['|| each=='{'){
                symbolStack.push(each);
                continue;
            }
            // at this point each is a closing symbol
            // stack should not be empty
            if (symbolStack.isEmpty())return false;

            switch (each){
                case ')':
                    if (symbolStack.pop()!='(') return false;
                    break;
                case ']':
                    if (symbolStack.pop()!='[') return false;
                    break;
                case '}':
                    if (symbolStack.pop()!='{') return false;
                    break;
            }
        }
        // return if stack is empty
        return symbolStack.isEmpty();
    }

}
