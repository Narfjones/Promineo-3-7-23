public class varExamples{
 

    public static void main(String[] args){
        String name;
        String mattPower = "Invincibility"; // Scope is in this method only
        String anaPower = "Teleportation";
        String bjPower = "Time Manipulation";
        
        // Keep your scope as small as possible

        supPrint(anaPower, "Ana");
        supPrint(mattPower, "Matt");
        supPrint(bjPower, "Bj");

        

    }

    public static void supPrint(String superPower, String name){
        System.out.println(String.format("%s has the super power " + superPower, name));
    }


}