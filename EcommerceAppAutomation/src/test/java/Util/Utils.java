package Util;

public class Utils {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}
