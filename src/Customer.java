import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.SECOND;

public class Customer extends Thread {

    private int numOfItems;
    private String scenarioName;

    public Customer(int numOfItems, String scenarioName) {
        this.numOfItems = numOfItems;
        this.scenarioName = scenarioName;
    }

    public void run() {
        int min = 60000;
        int numOfMins = Misc.getRandomInt(3);
        int totalWaitTime = (min * numOfMins) * this.numOfItems;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(this.scenarioName + ": Customer has " + this.numOfItems + " items. Customer enters dressing room at: " + dateFormat.format(date));
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(SECOND, totalWaitTime / 1000);
        Date currentDatePlusOne = c.getTime();
        System.out.println(this.scenarioName + ": Customer will exit dressing room at: " + dateFormat.format(currentDatePlusOne));
        try {
            sleep(totalWaitTime);
        } catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "numOfItems=" + numOfItems +
                '}';
    }
}
