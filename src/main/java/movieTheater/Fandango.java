package movieTheater;

public class Fandango extends Theater{
    private String dinner;

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public Fandango(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, boolean hasDrinks, String dinner) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D, hasDrinks);
        this.dinner=dinner;

    }
}
