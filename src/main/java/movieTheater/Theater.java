package movieTheater;

public abstract  class Theater {
    private int numOfSeats;
    private boolean hasPopcorn;
    private int numOfRooms;
    private int numOfRestrooms;
    private boolean has3D;
    private boolean HasDrinks;

    public Theater(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, boolean hasDrinks) {
        this.numOfSeats = numOfSeats;
        this.hasPopcorn = hasPopcorn;
        this.numOfRooms = numOfRooms;
        this.numOfRestrooms = numOfRestrooms;
        this.has3D = has3D;
        HasDrinks = hasDrinks;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isHasPopcorn() {
        return hasPopcorn;
    }

    public void setHasPopcorn(boolean hasPopcorn) {
        this.hasPopcorn = hasPopcorn;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getNumOfRestrooms() {
        return numOfRestrooms;
    }

    public void setNumOfRestrooms(int numOfRestrooms) {
        this.numOfRestrooms = numOfRestrooms;
    }

    public boolean isHas3D() {
        return has3D;
    }

    public void setHas3D(boolean has3D) {
        this.has3D = has3D;
    }

    public boolean isHasDrinks() {
        return HasDrinks;
    }

    public void setHasDrinks(boolean hasDrinks) {
        HasDrinks = hasDrinks;
    }
}
