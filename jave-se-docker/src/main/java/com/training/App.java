package com.training;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> nameList = Arrays.asList("Ram","Shyam","Vicky");
        
        nameList.forEach(System.out::println);
        
    }
}
