class Student{

    private static int studentCount = 0;

    public Student() {
        studentCount += 1;
    }

    public static void printStudentCount(){
        System.out.println(studentCount);
    }
}

class CoffeeMachine{
    public String coffeeBrand;
    private int price; //huf/dl
    private int cofInContainer;
    private int containerSize;

    public CoffeeMachine(String coffeeBrand, int containerSize, int price) {
        this.coffeeBrand = coffeeBrand;
        this.containerSize = containerSize;
        this.cofInContainer = containerSize;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 0){
            this.price = price;
        }
    }

    public int getCofInContainer() {
        return cofInContainer;
    }

    public int buy(int amount){
        if (amount > cofInContainer){
            return -1;
        }
        cofInContainer -= amount;
        return amount*price;
    }

    public int fill(int amount){
        if (amount+cofInContainer > containerSize){
            amount -= (cofInContainer+amount) - containerSize;
        }

        cofInContainer+=amount;
        return amount;
    }

    @Override
    public String toString() {
        return String.format("This coffee machine is selling %s at %d huf/dl. Container: %d/%d dl", coffeeBrand, price, cofInContainer, containerSize);
    }
}

public class Main {

    public static void main(String[] args) {
        Student.printStudentCount();
        Student s = new Student();
        Student.printStudentCount();

        CoffeeMachine cm = new CoffeeMachine("Bravos", 30, 100);
        System.out.println(cm);

        cm.setPrice(120);
        System.out.println(cm.buy(10));
        cm.setPrice(-2);
        System.out.println(cm.buy(10));
        System.out.println(cm.buy(15));
        System.out.println(cm);
        System.out.println(cm.fill(60));
    }
}
