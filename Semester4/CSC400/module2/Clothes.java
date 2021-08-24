public class Clothes {
    private String type;
    private String color;
    private double price;

    //Initilize the Object
    public Clothes(String newType, String newColor, double newPrice){
        type = newType;
        color = newColor;
        price = newPrice;
    }

    //Get the Artical of Clothing
    public String getType(){
        return this.type;
    }
        
    //Get the Color of Clothing
    public String getColor(){
        return this.color;
    }    
    
    //Get the Pirice of Clothing
    public double getPrice(){
        return this.price;
    }
}
