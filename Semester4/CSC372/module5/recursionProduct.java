public class recursionProduct {
    //This method will Take the Five Inputs and Call the Recursive Function with two at a time
    public static int findProduct(int a, int b, int c, int d, int e){
        return PrductByRecursion(PrductByRecursion(PrductByRecursion(PrductByRecursion(a, b), c), d), e);
    }

    public static int PrductByRecursion(int a, int b){
        //Putting the Bigger Number First lets the method Call itself less times
        if (a < b){
            return PrductByRecursion(b, a);
        }
        //Adding A for "B" Times
        else if(b != 0){
            return (a + PrductByRecursion(a, b-1));
        }
        else{
            return 0;
        }
    }

    public static void main(String [] args) {
        System.out.println(findProduct(3, 6, 4, 2, 6));
    } 
}
