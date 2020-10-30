public class DressingRoom {

    private int numOfRooms;

    public DressingRoom(int numOfRooms) {
        if (numOfRooms == 0) {
            this.numOfRooms = 3;
        } else {
            this.numOfRooms = numOfRooms;
        }
    }

    public void RequestRoom(Customer c) {
        c.start();
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }
}
