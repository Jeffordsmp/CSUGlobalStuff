import java.util.ArrayList;

public class shapeArray {
    public static void main(String [] args) {
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();
        shapeArray.add(new Rectangle(4, 6));
        shapeArray.add(new Circle(3));
        shapeArray.add(new Triangle(3, 4, 5));
        for (Shape shape : shapeArray){
            shape.output();
        }
    } 
}
