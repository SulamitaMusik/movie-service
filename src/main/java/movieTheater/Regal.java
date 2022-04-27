package movieTheater;

public class Regal extends Theater{

private  String secondFloor;

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }

    public Regal(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, boolean hasDrinks, String secondFloor) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D, hasDrinks);
        this.secondFloor=secondFloor;

    }
}
