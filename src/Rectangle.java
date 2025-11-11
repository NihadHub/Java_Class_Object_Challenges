public class Rectangle {
        public double width;
        public double length;
        public double Result;
        public Rectangle(double width, double length){
            this.length= length;
            this.width= width;
        }
        public double calculateArea(){
            Result = width*length;
            return Result;
        };
        public  void display(){
            System.out.println("Width= "+ width);
            System.out.println(("Length= "+ length));
            System.out.println("Rectangle's area = " +Result);
        }

    public static void main(String[] args){
            Rectangle rectangle1 = new Rectangle(12.5, 5);
            rectangle1.calculateArea();
            rectangle1.display();
    }
}
