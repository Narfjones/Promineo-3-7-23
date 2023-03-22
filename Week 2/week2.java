public class week2 {
    
    public static void main(String[] args){

        boolean work = false;  // Declare our variable and instantiate
        int age = 11; 
        int licenseAge = 16;
        boolean license = false;

        // Conditionals must be either a boolean or a boolean operation

        if(work){ // Conditional. If work is true, codeblock runs
            System.out.println("Bj wants to go to work tomorrow");
        } else{
            System.out.println("Bj definitely does not want to go to work tomorrow");
        }

        if(age >= licenseAge){ // Boolean Expression. Runs if true, doesn't run if false
            license = true;
            System.out.println("You're number is 236. Currently serving number 4.");
        } else {
            license = false;
            int difference = licenseAge - age;

            System.out.println("You've got " + Integer.toString(difference) + " years left until you can drive.");

        }



        // Switch statement for age
        switch(age){ // Condition is no longer boolean. Check for specific value

            case 16: // Must check possible values. No boolean conditions except equals
                license = true;
                System.out.println("You're number is 236. Currently serving number 4.");
                break;
            
            case 15:
                license = false;
                System.out.println("You got one more year");
                break;

            case 14:
                license = false;
                System.out.println("No chance. 2 more years.");
                break;
            
            case 13: // Fall through - Provides the next case statement
            case 12:
            case 11:
            case 10:
                license = false;
                System.out.println("A few more years until your letter from Hogwarts.");
                break;
            
            default:
                System.out.println("Gimme a real age grandpa."); // Runs if all other cases are false

        }

        // While(something is true) loop
        int count = 0;
        while(!license){ // While license is not true
            System.out.println("Did you get it yet?");
            count++;
            if (count >= 15){
                break;
            } else {
                continue;
            }
        }

        // do-while
        do{
            System.out.println("Did you get it yet?");
        } while(!license); // Checks condition after running once

        // For loop is for running a specific number of times
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }
    }
}
