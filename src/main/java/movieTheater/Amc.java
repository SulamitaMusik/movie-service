package movieTheater;

public class Amc  extends  Theater{
private boolean hasVr;

    public boolean isHasVr() {
        return hasVr;
    }

    public void setHasVr(boolean hasVr) {
        this.hasVr = hasVr;
    }

    public Amc(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, boolean hasDrinks, boolean hasVr) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D, hasDrinks);
        this.hasVr=hasVr;

    }
}
