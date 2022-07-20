public class myNonCompliant_2 {

    class NewUser{
        String username;
        String pass;
        public NewUser(String x, String y) {
            username = x;
            pass = y;
        }
    }

    void enterUserInfo(){
        String username = System.console().readLine("Enter Username");
        String password = System.console().readLine("Enter Password"); 
        NewUser myUser = new NewUser(username, password);
        randomOtherSystem(myUser);
    }

    private static final boolean randomOtherSystem(NewUser x) {
        return true;
    }
    public static void main (String [] args) {
    }

}

