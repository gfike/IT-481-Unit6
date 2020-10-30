public class Main {

    public static void main(String args[]) {
        scenario1();
        scenario2();
        scenario3();
    }

    public static void scenario1 () {
        System.out.println("Scenario 1: 2 customers, 2 rooms, max number of items is 6");
        Scenario s = new Scenario("scenario1",2, 2, 0);
        s.run();
    }

    public static void scenario2 () {
        System.out.println("Scenario 2: 2 customers, 2 rooms, max number of items is 20");
        Scenario s = new Scenario("scenario2",2,2,20);
        s.run();
    }

    public static void scenario3() {
        System.out.println("Scenario 3: 3 customers, 2 rooms, max number of items is 6");
        Scenario s = new Scenario("scenario3",3,2,6);
        s.run();
    }
}
