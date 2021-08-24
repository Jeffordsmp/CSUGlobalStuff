public class Bag {
    //Set the Size of the bag
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private Clothes[] data;
    private int count;

    //Initilize the Bag
    public Bag(){
        setCapacity(DEFAULT_CAPACITY);
		data = (Clothes[])new Clothes[capacity];
        count = 0;
    }

    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }

    //Get the number of Elements In the Bag
    public int getSize(){
        return count;
    }

    //Add an Element To the Bag
    public void add(Clothes element) 
	{
        //Cannot add more Elements Than the Capacity
		if (count >= capacity) 
		{
			System.out.println("Bag is Full!");
		} 
		else 
		{
			data[count] = element;
			count++;
		}
	}

    //Booleans For Empty or Full Bag
    public boolean isEmpty()
	{
		return (count == 0);
	}

    public boolean isFull()
	{
		return (count == capacity);
	}

    //Get the frecquency of a specific Color
    public int getCountColor(String color){
        int colorCount = 0;
        for (int i = 0; i < count; i++){
            Clothes x = data[i];
            String y = x.getColor();
            boolean isEqual = (y.equals(color));
            if(isEqual){
                colorCount ++;
            }
        }
        return colorCount;
    }

    //Get the frequencey of a specific Clothing Type
    public int getCountType(String type){
        int countType = 0;
        for (int i = 0; i < count; i++){
            Clothes x = data[i];
            String y = x.getType();
            boolean isEqual = (y.equals(type));
            if(isEqual){
                countType ++;
            }
        }
        return countType;
    }

    //Get the frequency of items less than a price
    public int countItemsLessThan(int price){
        int priceCount = 0;
        for (int i = 0; i < count; i++){
            Clothes x = data[i];
            double y = x.getPrice();
            boolean isTrue = (y < price);
            if(isTrue){
                priceCount ++;
            }
        }
        return priceCount;
    }

    //Get the frequency of items more than a price
    public int countItemsMoreThan(int price){
        int priceCount = 0;
        for (int i = 0; i < count; i++){
            Clothes x = data[i];
            double y = x.getPrice();
            boolean isTrue = (y > price);
            if(isTrue){
                priceCount ++;
            }
        }
        return priceCount;
    }

    //Get the frequency of items Bettween two Prices
    public int countItemsBettween(int lowPrice, int highPrice){
        int priceCount = 0;
        for (int i = 0; i < count; i++){
            Clothes x = data[i];
            double y = x.getPrice();
            boolean isLow = (y < highPrice);
            boolean isHigh = (y > lowPrice);
            if(isLow && isHigh){
                priceCount ++;
            }
        }
        return priceCount;
    }

    //Display The Bag as an array
    public String[] toArray() {
        String[] copy = new String[count];
        
        for (int i = 0; i < count; i++) {
            String type = data[i].getType();
            String color = data[i].getColor();
            double price = data[i].getPrice();

            copy[i] = ("(" + type + ", " + color + ", " + price + ")");
        }
        
        return copy;
    }
}
