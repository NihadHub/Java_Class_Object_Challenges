public class Temperature {
    public int celsius;
    public Temperature(int celsius){
        this.celsius = celsius;
    }
    public int toFahrenheit(){
        return(celsius * 9/5) + 32;
    }
    public void display(){
        System.out.println("Temperature en Celsius: " + celsius);
        System.out.println("Temperature en Fahrenheit: " + toFahrenheit());
    }
    public static void main (String[] args){
        Temperature temperature = new Temperature(23);
        temperature.display();
    }


}

