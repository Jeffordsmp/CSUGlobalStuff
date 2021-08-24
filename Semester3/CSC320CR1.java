public class CSC320CR1 {
   String first;
   String last;
   String address;
   String city;
   int zip;

   public CSC320CR1(String firstName, String lastName, String homeAddress, String homeCity, int zipCode){
       first = firstName;
       last = lastName;
       address = homeAddress;
       city = homeCity;
       zip = zipCode;
   }
   public static void main(String[] args) {

      CSC320CR1 myObj = new CSC320CR1("John", "Doe", "123 Down The Rd", "Denver", 80021);

      System.out.println("Frist Name: " + myObj.first);
      System.out.println("Last Name: " + myObj.last);
      System.out.println("Address: " + myObj.address);
      System.out.println("City: " + myObj.city);
      System.out.println("Zipcode: " + myObj.zip);
   }
}