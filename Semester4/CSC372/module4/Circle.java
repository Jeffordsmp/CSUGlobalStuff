public class Circle extends Shape{
    private int radius;
    private double area;
    private double perameter;

    public Circle(int newRadius){
        radius = newRadius;
        area = area();
        perameter = perameter();
    }

    double area(){
        double newArea;
        newArea = (radius * radius) * 3.14;
        return newArea;
    }

    double perameter(){
        double newPeram;
        newPeram = (radius * 3.14) * 2;
        return newPeram;
    }

    @Override
    public void output(){
        System.out.println("This Circle has and area of " + area + " and a perameter of " + perameter + ".");
    }
}
