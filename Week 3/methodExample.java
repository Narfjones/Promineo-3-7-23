public class methodExample {
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        String[] str = {"a", "b", "c"};

        int sum = sumArray(arr);
        sumPrint(arr);
        encourageBot();

        int res = multiply(456, 6752);

        System.out.println(res);
    }

    // requires specific input, gives specific output
    public static int sumArray(int [] numbers) {
        int sum = 0;
        for (int number: numbers) {
        sum += number;
        }
        return sum; // Ends your method
    }

    // requires specific input, has no return output
    public static void sumPrint(int [] numbers){
        int sum = 0;
        for (int number: numbers) {
        sum += number;
        }
        System.out.println(sum);
    }

    // no input required, has no return output
    public static void encourageBot(){
        System.out.print("You can do it!");
    }

    public static int multiply(int a, int b){

        int res = a * b;

        return res;
    }

    


}
