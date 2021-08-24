public class Student {
    private int rollno;
    private String name;
    private String address;

    public Student(int RollNumber, String Name, String Address){
        rollno = RollNumber;
        name = Name;
        address = Address;
    }

    public int getRollNo(){
        return this.rollno;
    }
        
    public String getName(){
        return this.name;
    }    
    
    public String getAddress(){
        return this.address;
    }
}
