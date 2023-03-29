import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class listExamples {
    
    public static void main(String[] args){

    // tenWords/threeWords List Example
    wordsExample();

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Create a loop that finds all the (positive) factors of the value of userNumber and stores 
    // them as elements of a new list. Note: All values of 
    // userNumber will have two (2) possible factors at a minimum: 
    // one (1) and userNumber. Then print the list to the console.

        int userNumber = 42;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // loop from 1 to the number because all factors of a number are smaller than the number
        // divide number by the iterator and if the remainder is an integer than the number is a factor
        // remove duplicates

        for(int i = 1; i <= userNumber; i++){

            if( userNumber % i == 0 ){
                arr.add(i);
            } else{
                continue;
            }

        }

        System.out.println(arr);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    //Given a List called tenWords that contains ten (10) different words,
    //write a program that takes integer values stored in num1, num2, and 
    //num3 and use that information to find the value stored in the particular 
    //positions in the List. Take these three (3) words and create a new List called threeWords. 
    //Print out the List stored in threeWords to the console.

    static void wordsExample(){
        int num1 = 21;
        int num2 = 4;
        int num3 = 7;
		
		List<String> tenWords = new ArrayList<>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
    }

    static void wordReplace(List<String> l, int num1, int num2, int num3){
        List<String> threeWords = new ArrayList<>();
        
        if(num1 >= 0 && num1 <= l.size()){
        threeWords.add(l.get(num1));
        }
        threeWords.add(l.get(num2));
        threeWords.add(l.get(num3));

        System.out.println(threeWords);
    }

}
