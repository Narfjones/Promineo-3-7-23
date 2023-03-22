import java.io.*;
import java.util.*;


public class forLoopExample {

        public static void main(String[] args) {
            
        }

        void question1(){
            Scanner in = new Scanner(System.in);
            String userWord = in.next();
            String longString ="";
    
            int wordLength = userWord.length();

           // create your for loop here
            for (int i = 1;  i <= userWord.length(); i++){
                longString += userWord;
            }
       
            // Do not change this code
            System.out.println(longString);
        }

        void enhancedLoop(){
            
            String[] arr = {"a", "b", "c", "d", "e", "f"};

            // standard for loop
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }

            // enhanced for loop
            for (String i : arr){
                System.out.println(i);
            }


        }
    }
    
