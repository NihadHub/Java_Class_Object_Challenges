public class productDetails {
    public int id ;
    public double price;
    public String name;

    public productDetails(int id, double price, String name){
        this.id = id;
        this.price= price;
        this.name = name;
    };

    public void displayProduct(){
        System.out.println("Product id: " + id);
        System.out.println("Product price: " + price+ " MAD");
        System.out.println("Product name: " + name);
    }


    public static void main(String[] args){
        productDetails product1 = new productDetails(5,154.56,"Table");
        product1.displayProduct();
    }
}
