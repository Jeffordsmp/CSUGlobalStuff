import java.util.Scanner;
import java.util.ArrayList;

public class CSC320CR5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<String>();
        ArrayList<Double> temps = new ArrayList<Double>();

        String day;
        double temp;
        double averageTemp = 0;
        boolean keepGoing = true;

        do{
            System.out.println("Enter Day of the Week: ");
            day = scnr.nextLine().toLowerCase();

            switch(day){
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                case "saturday":
                case "sunday":
                    days.add(day);
                    System.out.println("Enter Temp (in F) For that Day: ");
                    temp = scnr.nextDouble();
                    temps.add(temp);
                    scnr.nextLine();
                    break;
                case "week":
                    scnr.close();
                    keepGoing = false;
                    for(int i = 0; i < days.size(); i++){
                        System.out.print("The Temp for ");
                        System.out.print(days.get(i));
                        System.out.print(" was: ");
                        System.out.println(temps.get(i));
                        averageTemp += temps.get(i);
                    };
                    averageTemp /= temps.size();
                    System.out.print("The average Temp for the Week was: ");
                    System.out.println(averageTemp);
                    break;
                default:
                    System.out.println("Your submision was not valid please try again");

            }
        }while(keepGoing);
    }
}


