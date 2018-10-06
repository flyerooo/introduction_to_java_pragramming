public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;
    private int id;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        id = ++numberOfBicycles;
    }

    private static int numberOfBicycles =0;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUP(int increment) {
        speed += increment;
    }
    public int getID(){
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
}

//
//public class MountainBike extends Bicycle {
//    public int seatHeight;
//
//    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
//        super(startCadence, startSpeed, startGear);
//        seatHeight = startHeight;
//    }
//
//    public void setSeatHeight(int newValue) {
//        seatHeight = newValue;
//    }
//}
//
//class MyClass extends MySuperClass implements YourInterface{
//    //
//}

