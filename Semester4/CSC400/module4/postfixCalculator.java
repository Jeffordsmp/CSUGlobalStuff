import java.util.Stack;

public class postfixCalculator {
    public static double postCalculator(String exp){
        //Create Stack
        Stack<Double> stack = new Stack<Double>();
        //Loop Through String
        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(Character.isDigit(c)){
                //If the character is a number
                //Make it a double, So there can be decimals
                //And Put it in the stack
                stack.push((double) Character.digit(c, 10));
            }
            else{
                //If the character is not a number
                //Take the Top two numbers in the stack
                Double y = stack.pop();
                Double x = stack.pop();
                //Depending on what sign the charater is do that math
                //Add the new number to the stack
                switch (c) {
                    case '+':
                        stack.push(x+y);
                        break;
                    case '-':
                        stack.push(x-y);
                        break;
                    case '*':
                        stack.push(x*y);
                        break;
                    case '/':
                        stack.push(x/y);
                        break;
                    default:
                        break;
                }
            }
        }
        //Once the sting is looped throuh retun the top number in the stack
        return stack.pop();
    }

    public static void main(String [] args) {
        String data1 = "1";
        String data2 = "2";
        String data3 = "4";
        String data4 = "5";
        String data5 = "3";
        //Creating Stings to give the method
        String exprs1 = (data1 + data2 + "+" + data3 + "*" + data4 + "-");
        String exprs2 = (data1 + data2 + "*" + data3 + data1 + "-/" + data4 + data5 + "*+");
        System.out.println("The expression of " + exprs1 + " equals:" + postCalculator(exprs1));
        System.out.println("The expression of " + exprs2 + " equals:" + postCalculator(exprs2));
    }
}
