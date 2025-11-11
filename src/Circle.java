public class Circle {
    final double P = 3.14;
    public double reduis;
    public double result;

    public Circle(double reduis){
        this.reduis= reduis;
    }

    public double getArea(double reduis){
        result= P*reduis*reduis;
        return result;
    };

    public double getCircumference(double reduis){
        result = 2*P*reduis;
        return result;
    };

    public void displayAll(){
        System.out.println("Area= "+ getArea(reduis));
        System.out.println("Circumference= " + getCircumference(reduis));
    }
    public static void main(String[] args){
        Circle circle1= new Circle(2);
        circle1.displayAll();

    }
}
