class CountUp extends Thread {
    public void run()
    {
        try {
            for(int i = 0; i < 21; i++) {
                System.out.println("T1: " + i);
            }
        }
        catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
    }
}

class CountDown extends Thread {
    public void run()
    {
        try {
            for(int i = 20; i > -1; i--) {
                System.out.println("T2: " + i);
            }
        }
        catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
    }
}


public class multithreading {

    public static void main(String [] args) {
        CountUp countUp = new CountUp();
		countUp.start();

        CountDown countDown = new CountDown();
        countDown.start();
    }

}