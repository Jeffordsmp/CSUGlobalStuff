import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CSC320CR4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Float> grades = new ArrayList<Float>();
        Float grade;

        for(int i=0; i<10; i++){
            System.out.println("Enter Grade of Student:");
            grade = scnr.nextFloat();
            grades.add(grade);
        };

        scnr.close();

        Collections.sort(grades);

        Float maxgrade = grades.get(9);
        Float mingrade = grades.get(0);
        float avggrade = 0;
        for(Float x:grades){
            avggrade += x;
        };
        avggrade /= 10;
        
        System.out.print("The Average Grade is: ");
        System.out.println(avggrade);

        System.out.print("The Maximum Grade is: ");
        System.out.println(maxgrade);

        System.out.print("The Minimum Grade is: ");
        System.out.println(mingrade);
    }
}
