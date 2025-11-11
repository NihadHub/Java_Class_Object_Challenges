public class Car {
    public String brand;
    public double year;
    public String model ;

    public Car(String brand, double year, String model){
        this.brand= brand;
        this.year=year;
        this.model= model;
    }
    public void displayCar(){
        System.out.println("Car brand is : "+ brand);
        System.out.println("Car year is: "+year);
        System.out.println("Car model is: "+model);
    }

    public static void main(String[] args){
        Car car1 = new Car("Mercedes", 2019,"Whatever");
        car1.displayCar();
    }
}
