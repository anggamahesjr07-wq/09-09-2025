public class Car extends Vehicle {
    //property class
    int numberOfDoors;
    boolean isElectric;
     //cosntructor class
    public Car() {
        mark = "Toyota";
        milesPerGallon = 30;
    }

    public Car(String mark, int milesPerGallon) {
        this.mark = mark;
        this.milesPerGallon = milesPerGallon;
}
    //getter
    //getter
    //method
    public void print() {
        System.out.println("Mark: " + mark);
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
