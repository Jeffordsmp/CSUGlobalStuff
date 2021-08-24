import java.util.Scanner;

public class CSC320CR2 {

    String brand;
    String model;
    int year;
    int startOd;
    int endOd;
    int gallonsused;
    int mpg;

    public CSC320CR2(String carBrand, String carModel, int carYear, int firstOd, int lastOd, int carGall){
       brand = carBrand;
       model = carModel;
       year = carYear;
       startOd = firstOd;
       endOd = lastOd;
       gallonsused = carGall;
       mpg = (this.endOd - this.startOd)/this.gallonsused;
   }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String carBrand;
        String carModel;
        int carYear;
        int firstOd;
        int lastOd;
        int carGall;
        System.out.println("Enter Car Brand: ");
        carBrand = scnr.nextLine();
        System.out.println("Enter Car Model: ");
        carModel = scnr.nextLine();
        System.out.println("Enter Car Year: ");
        carYear = scnr.nextInt();
        System.out.println("Enter Starting Odometer Reading: ");
        firstOd = scnr.nextInt();
        System.out.println("Enter Ending Odometer Reading: ");
        lastOd = scnr.nextInt();
        System.out.println("Enter Gallons Used: ");
        carGall = scnr.nextInt();
        scnr.close();
        CSC320CR2 myObj = new CSC320CR2(carBrand, carModel, carYear, firstOd, lastOd, carGall);

        System.out.print("\nCar Brand: ");         
        System.out.println(myObj.brand); 

        System.out.print("\nCar Model: ");         
        System.out.println(myObj.model); 

        System.out.print("\nCar Year: ");         
        System.out.println(myObj.year); 

        System.out.print("\nStarting Odometer Reading: ");         
        System.out.println(myObj.startOd); 

        System.out.print("\nEnding Odometer Reading: ");         
        System.out.println(myObj.endOd); 

        System.out.print("\nGallons Used: ");         
        System.out.println(myObj.gallonsused); 

        System.out.print("\nMPG: ");         
        System.out.println(myObj.mpg); 
        System.out.println("---------------"); 
    }
}
