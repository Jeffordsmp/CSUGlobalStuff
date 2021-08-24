public class Rectangle extends Shape{
    private int width;
    private int length;
    private double area;
    private double perameter;

    public Rectangle(int newWidth, int newLength){
        width = newWidth;
        length = newLength;
        area = area();
        perameter = perameter();
    }

    double area(){
        double newArea;
        newArea = (2 * width) * (2 * length);
        return newArea;
    }

    double perameter(){
        double newPeram;
        newPeram = (2 * width) + (2 * length);
        return newPeram;
    }

    @Override
    public void output(){
        System.out.println("This Rectangle has and area of " + area + " and a perameter of " + perameter + ".");
    }
}
