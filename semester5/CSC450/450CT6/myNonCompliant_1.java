public class myNonCompliant_1 {


    class User{
        static String pass = "ABC123";
    }

    void getPassword() {
        String password;
        password = User.pass;

        randomOtherSystem(password);
    }

    //This is some sort of method that will take the password
    private static final boolean randomOtherSystem(String password) {
        return true;
    }

    public static void main (String [] args) {

    }
}

