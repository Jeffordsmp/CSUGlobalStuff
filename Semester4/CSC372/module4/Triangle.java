import java.lang.Math;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;
    private double area;
    private double perameter;

    public Triangle(int lenSide1, int lenSide2, int lenSide3){
        side1 = lenSide1;
        side2 = lenSide2;
        side3 = lenSide3;
        perameter = perameter();
        area = area();
    }

    double area(){
        double newArea;
        double s = perameter()/2;
        newArea = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return newArea;
    }

    double perameter(){
        double newPeram;
        newPeram = side1 + side2 + side3;
        return newPeram;
    }

    @Override
    public void output(){
        System.out.println("This Triangle has and area of " + area + " and a perameter of " + perameter + ".");
    }
}
