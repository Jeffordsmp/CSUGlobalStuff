import java.util.Arrays;
public class bagMain {
    
    public static void main(String [] args) {
        // initilize bag and add elements
        Bag myBag = new Bag();
        myBag.add(new Clothes("Shirt", "Red", 29.99));
        myBag.add(new Clothes("Shorts", "Blue", 15.99));
        myBag.add(new Clothes("Shorts", "Red", 17.99));
        myBag.add(new Clothes("Shoes", "Green", 25.45));
        myBag.add(new Clothes("Shirt", "Blue", 35.99));
        myBag.add(new Clothes("Shorts", "Green", 12.99));
        myBag.add(new Clothes("Shirt", "Blue", 19.99));
        myBag.add(new Clothes("Shoes", "Red", 40.99));
        myBag.add(new Clothes("Shorts", "Blue", 19.99));
        myBag.add(new Clothes("Shirt", "Green", 21.99));

        // print the array of items in the bag
        System.out.println(Arrays.toString(myBag.toArray()));

        // getting the frequencies of diffrent atrributes
        System.out.println("There are " + myBag.getCountType("Shorts") + " Shorts in this Bag");
        System.out.println("There are " + myBag.getCountColor("Red") + " Red Items in this Bag");
        System.out.println("There are " + myBag.countItemsLessThan(16) + " Items less than $16");
        System.out.println("There are " + myBag.countItemsMoreThan(30) + " Items more than $30");
        System.out.println("There are " + myBag.countItemsBettween(20, 25) + " Items between $20 and $25");

        System.out.println("Is the bag Empty: " + myBag.isEmpty());
        System.out.println("Is the bag Full: " + myBag.isFull());
        
        // Trying to add an item to a full bag
        myBag.add(new Clothes("Shorts", "Blue", 15.99));
    }
}
