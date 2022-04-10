import java.util.*;
import java.util.stream.*;

public class StreamsDemo7{

    public static int compute(int k, int n){
        int result = 0;

        int index = k;
        int count = 0;
        while(count < n){
            if((index % 2 == 0) && (Math.sqrt(index) > 20)){
                result += (index * 2);
                count++;
            }
            index++;
        }        

        return result;
    }

    public static int computeWithStreams(int k, int n){
        return Stream.iterate(k, e -> e + 1)            //Unbounded, Lazy
                    .filter(e -> e % 2 == 0)            //Unbounded, Lazy    
                    .filter(e -> Math.sqrt(e) > 20)     //Unbounded, Lazy
                    .mapToInt(e -> e * 2)               //Unbounded, Lazy
                    .limit(n)                           //Bounded, Lazy
                    .sum();                             //Terminal operation - Eager evaluation
    }

    public static void main(String[] args){

        //Given a number k, and a count n, find the sum of double of 
        //n even numbers starting with k, where sqrt of each number is > 20

        int k = 121;
        int n = 51;
        System.out.println(compute(k, n));
        System.out.println(computeWithStreams(k, n));


    }



}
