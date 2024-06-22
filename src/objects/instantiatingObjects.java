package objects;

/*
* Write a class that creates instances of the 'rectangle' class to find the
* total area of two rooms in a house.
 */

public class instantiatingObjects {
    // Home area calculator

    public static void main(String[] args){

        rectangle room1 = new rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        rectangle room2 = new rectangle(30,75);
        double areOfRoom2 = room2.calculateArea();
    }
}
