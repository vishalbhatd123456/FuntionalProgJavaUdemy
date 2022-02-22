// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        //Functional Progeamming In Java
        printNonFuncProg(List.of(1,2,3,4));
        
    }
    private static void printNonFuncProg(List<Integer> numbers){
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
