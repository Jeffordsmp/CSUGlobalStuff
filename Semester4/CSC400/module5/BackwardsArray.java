import java.util.ArrayList;

public class BackwardsArray {
    public static ArrayList<Integer> RecursiveArray(ArrayList<Integer> arr){
        if (arr.isEmpty()){
            return arr;
        }
        else{
            int x = arr.get(0);
            arr.remove(0);
            arr = RecursiveArray(arr);
            arr.add(x);
            return arr;
        } 
    }    
    public static void main(String [] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);

        System.out.println("The Original Array is: " + myArray);

        System.out.println("The Backwards Array Using Recursion is: " + RecursiveArray(myArray));
    } 
}
