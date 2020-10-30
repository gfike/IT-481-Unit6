public class Scenario {

    private DressingRoom dr;
    private int maxNumOfItems;
    private int numOfCusts;
    private String scenarioName;

    public Scenario(String scenarioName, int numOfCusts, int numOfRooms, int maxNumOfItems) {
        this.scenarioName = scenarioName;
        this.numOfCusts = numOfCusts;

        if (numOfRooms == 0) {
            this.dr = new DressingRoom(3);
        } else {
            this.dr = new DressingRoom(numOfRooms);
        }

        if(maxNumOfItems == 0) {
            this.maxNumOfItems = 6;
        } else {
            this.maxNumOfItems = maxNumOfItems;
        }
    }

    public void run() {
        int numOfRooms = this.dr.getNumOfRooms();
        for(int i = 0; i < this.numOfCusts; i++) {
            Customer c = new Customer(this.maxNumOfItems, this.scenarioName);
            if (numOfRooms != 0) {
                numOfRooms--;
                this.dr.RequestRoom(c);
                numOfRooms++;
            } else {
                System.out.println(this.scenarioName + " All rooms are in use");
            }
        }
    }
}
