import java.util.Scanner;

public class CSC320CR3 {
    
    int weekAvg;
    double monthTotalWithCoup;
    double weekAvgWithCoup;

    public CSC320CR3(double coupon, int monthTotal){
       weekAvg = monthTotal/4;
       monthTotalWithCoup = monthTotal*coupon;
       weekAvgWithCoup = this.weekAvg*coupon;
   }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double coupon;
        boolean couponMoreThan0;
        boolean couponLessThan1;
        int grocery1;
        int grocery2;
        int grocery3;
        int grocery4;
        int monthTotal;

        System.out.println("Enter Coupon as Decimal: ");
        coupon = scnr.nextDouble();
        couponMoreThan0 = (coupon>0);
        couponLessThan1 = (coupon<1);
        if (!couponLessThan1 || !couponMoreThan0){
            coupon = 0.1;
        }
        coupon = (1 - coupon);
    
        System.out.println("Enter Your Grocery Bill for week 1: ");
        grocery1 = scnr.nextInt();
        System.out.println("Enter Your Grocery Bill for week 2: ");
        grocery2 = scnr.nextInt();
        System.out.println("Enter Your Grocery Bill for week 3: ");
        grocery3 = scnr.nextInt();
        System.out.println("Enter Your Grocery Bill for week 4: ");
        grocery4 = scnr.nextInt();
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");
        scnr.close();

        monthTotal = grocery1+grocery2+grocery3+grocery4;

        CSC320CR3 myObj = new CSC320CR3(coupon, monthTotal);

        System.out.print("Monthly Total Without Coupon: ");         
        System.out.println(monthTotal);
        System.out.println("");

        System.out.print("Weekly Average Without Coupon: ");         
        System.out.println(myObj.weekAvg);
        System.out.println("");

        System.out.print("Monthly Total With Coupon: ");         
        System.out.println(myObj.monthTotalWithCoup);
        System.out.println("");

        System.out.print("Weekly Average With Coupon: ");         
        System.out.println(myObj.weekAvgWithCoup);
        System.out.println("");
    }
}
