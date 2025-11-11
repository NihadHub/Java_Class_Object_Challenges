 class studentInformation {
    public String name;
    public int age;
    public String grade;

    public studentInformation(String name, int age,String grade){
        this.name = name;
        this.age = age;
        this.grade= grade;
    }

    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+ grade);

    }

    public static void main(String[]args){
        studentInformation student1 = new studentInformation("Nihad",20,"A++");
        student1.displayInfo();
    }
}
