import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CSC320PortfolioProject {
    String make;
    String modle;
    String color;
    int year;
    int mileage;
    String line;

    public CSC320PortfolioProject(String carMake, String carModel, String carColor, int carYear, int carMileage){
        make = carMake;
        modle = carModel;
        color = carColor;
        year = carYear;
        mileage = carMileage;
        line = (this.make.toLowerCase() + "/" + this.modle.toLowerCase() + "/" + this.color.toLowerCase());
    }

    public static CSC320PortfolioProject makeCar(Scanner scnr){
        String carMake;
        String carModel;
        String carColor;
        int carYear;
        int carMileage;

        scnr.nextLine();
        System.out.println("Enter Car Make:");
        carMake = scnr.nextLine();
        System.out.println("Enter Car Model:");
        carModel = scnr.nextLine();
        System.out.println("Enter Car Color:");
        carColor = scnr.nextLine();
        System.out.println("Enter Year of Car:");
        carYear= scnr.nextInt();
        System.out.println("Enter Car Mileage:");
        carMileage = scnr.nextInt();
        
        CSC320PortfolioProject myCar = new CSC320PortfolioProject(carMake, carModel, carColor, carYear, carMileage);

        return myCar;
    }

    public static void addCar(CSC320PortfolioProject myCar) throws Exception{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Cars.txt", true)));
        out.println(myCar.line);
        out.println(myCar.make);
        out.println(myCar.modle);
        out.println(myCar.color);
        out.println(myCar.year);
        out.println(myCar.mileage);
        out.close();

        System.out.println("\nA Car with these Attritbutes was Successfully Added!\n");
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.modle);
        System.out.println("Car Color: " + myCar.color);
        System.out.println("Car Year: " + myCar.year);
        System.out.println("Car Mileage: " + myCar.mileage);
    }

    public static String findCar(Scanner scnr) throws Exception{
        String carMake;
        String carModel;
        String carColor;
        String carLine;

        scnr.nextLine();
        System.out.println("Enter Car Make:");
        carMake = scnr.nextLine();
        System.out.println("Enter Car Model:");
        carModel = scnr.nextLine();
        System.out.println("Enter Car Color:");
        carColor = scnr.nextLine();

        carLine = (carMake.toLowerCase() + "/" + carModel.toLowerCase() + "/" + carColor.toLowerCase());

        BufferedReader reader = new BufferedReader(new FileReader("Cars.txt"));

        String currentLine;

        boolean foundCar = false;

        while((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(carLine)){
                foundCar = true;
                for(int i = 0; i < 6; i++){
                    switch (i){
                        case 0:
                            currentLine = reader.readLine();
                            System.out.println("A Car with these Attritbutes was Was Found!\n");
                            break;
                        case 1:
                            System.out.println("Car Make: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 2:
                            System.out.println("Car Model: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 3:
                            System.out.println("Car Color: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 4:
                            System.out.println("Car Year: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 5:
                            System.out.println("Car Mileage: " + currentLine);
                            System.out.println("");
                            break;
                    }
                }
            };
        }
        reader.close(); 
        if(foundCar){
            return carLine;
        }else{
            return "stop";
        }
    }
    
    public static void deleteCar(String carLine) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("Cars.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("TempCars.txt"));

        String lineToRemove = carLine;
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)){
                for(int i = 0; i < 6; i++){
                    switch (i){
                        case 0:
                            currentLine = reader.readLine();
                            System.out.println("A Car with these Attritbutes was Successfully Removed!\n");
                            break;
                        case 1:
                            System.out.println("Car Make: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 2:
                            System.out.println("Car Model: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 3:
                            System.out.println("Car Color: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 4:
                            System.out.println("Car Year: " + currentLine);
                            currentLine = reader.readLine();
                            break;
                        case 5:
                            System.out.println("Car Mileage: " + currentLine);
                            System.out.println("");
                            break;
                    }
                }
            }else{
                writer.write(currentLine + System.getProperty("line.separator"));
            };

        }
        writer.close(); 
        reader.close(); 
        overwritefile();
    }

    public static void overwritefile() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("TempCars.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Cars.txt"));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close(); 
        reader.close(); 
    }

    public static void listCars() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("Cars.txt"));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            for(int i = 0; i < 6; i++){
                switch (i){
                    case 0:
                        currentLine = reader.readLine();
                        break;
                    case 1:
                        System.out.println("Car Make: " + currentLine);
                        currentLine = reader.readLine();
                        break;
                    case 2:
                        System.out.println("Car Model: " + currentLine);
                        currentLine = reader.readLine();
                        break;
                    case 3:
                        System.out.println("Car Color: " + currentLine);
                        currentLine = reader.readLine();
                        break;
                    case 4:
                        System.out.println("Car Year: " + currentLine);
                        currentLine = reader.readLine();
                        break;
                    case 5:
                        System.out.println("Car Mileage: " + currentLine);
                        System.out.println("");
                        break;
                }
            }
        }
        reader.close(); 
    }

    public static void editCars(String carLine, Scanner scnr) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("Cars.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("TempCars.txt"));

        String lineToRemove = carLine;
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)){
                for(int i = 0; i < 5; i++){
                    currentLine = reader.readLine();
                }
            }else{
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
        writer.close(); 
        reader.close(); 
        overwritefile();

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Cars.txt", true)));

        System.out.println("Enter the New Information for the car");
        CSC320PortfolioProject myCar = makeCar(scnr);
        out.println(myCar.line);
        out.println(myCar.make);
        out.println(myCar.modle);
        out.println(myCar.color);
        out.println(myCar.year);
        out.println(myCar.mileage);
        out.close();
        System.out.println("The Car has been Successfully Updated!");
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int selection;
        boolean keepGoing = true;

        do{
            System.out.println("Press 1 to Add Car\nPress 2 to Delete\nPress 3 to Edit A Car\nPress 4 to List All Cars\nPress 0 to Stop");
            selection = scnr.nextInt();
            System.out.println("");
            switch (selection){
                case 1:
                    try{
                        addCar(makeCar(scnr));
                    }catch(Exception excpt){
                        System.out.println("Something Went Wrong try again.");
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Enter the Information of the car you want to remove\n");
                        String x = findCar(scnr);
                        boolean what = (x.equals("stop"));
                        if(what){
                            System.out.println("No Car was Found, Try again");
                        }else{
                            Character awnser;
                            System.out.println("Do You want to remove this Car (Y/N)");
                            awnser = scnr.next().toLowerCase().charAt(0);
                            System.out.println("");
                            switch(awnser){
                                case 'y':
                                    deleteCar(x);
                                    break;
                                case 'n':
                                    System.out.println("This Car will not be removed");
                                    break;
                                default:
                                    System.out.println("Your selection was not valid plese try again");
                            };
                        }
                    }catch(Exception excpt){
                        System.out.println("Something Went Wrong try again.");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Enter the Information of the car you want to edit");
                        String x = findCar(scnr);
                        boolean what = (x.equals("stop"));
                        if(what){
                            System.out.println("No Car was Found, Try again");
                        }else{
                            Character awnser;
                            System.out.println("Do You want to edit this Car (Y/N)");
                            awnser = scnr.next().toLowerCase().charAt(0);
                            System.out.println("");
                            switch(awnser){
                                case 'y':
                                    editCars(x, scnr);
                                    break;
                                case 'n':
                                    System.out.println("This Car will Stay the same");
                                    break;
                                default:
                                    System.out.println("Your selection was not valid plese try again");
                            };
                        }
                    }catch(Exception excpt){
                    System.out.println("Something Went Wrong try again.");
                    }
                    break;
                case 4:
                    try{
                        listCars();
                    }catch(Exception excpt){
                        System.out.println("Something Went Wrong try again.");
                    }
                    break;
                case 0:
                    System.out.println("Closing App");
                    keepGoing = false;
                    scnr.close();
                    break;
                default:
                    System.out.println("Your selection was not valid plese try again");
                }
            System.out.println("---------------------");
        }while(keepGoing);
    }
}