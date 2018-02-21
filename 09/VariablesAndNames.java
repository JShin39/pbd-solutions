public class VariablesAndNames {
    public static void main(String[] args) {

        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInACar, carpoolCapacity, averagePassengersPerCar;

        // sets cars to number 100
        cars = 100;
        // sets spaceInACar to number 4
        spaceInACar = 4;
        // sets drivers to number 30
        drivers = 30;
        // sets passengers to number 90
        passengers = 90;
        // sets carsNotDriven to 100 - 30 = 70
        carsNotDriven = cars - drivers;
        // sets carsDriven to 30
        carsDriven = drivers;
        // sets carpoolCapacity to 30 * 4 = 120
        carpoolCapacity = carsDriven * spaceInACar;
        // sets averagePassengersPerCar to 90 / 30 = 3
        averagePassengersPerCar = passengers / carsDriven;


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
