// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        printAllNumbersInListStructuredApproach(List.of(12,9,13,4,8,2,1,1,1,1)) ;
    }
    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInListStructuredApproach(List<Integer> numbers){
        //1. what to do -> convert the numbers into a stream of numbers
        // 2. For each of the number in the list, we call the print method
        //3. We caonvert the list into a stream and then call the class name with the method to be invoked => Method Reference Concept
        
        
       
        numbers.stream()
        .forEach(HelloWorld::print); 
            
        
    }
}
