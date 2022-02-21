// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        printAllNumbersInListStructuredApproach(List.of(12,9,13,4,8,2,1,1,1,1)) ;
    }
    private static void printAllNumbersInListStructuredApproach(List<Integer> numbers){
        //orint all the numbers in the list
        //loop the numbers
        for(int number : numbers){
            System.out.println(number);
        }
        
    }
}
