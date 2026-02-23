public class Main {
    public static void main(String[] args){
        Car suzu = new Car("Suzuki", "Swift", 2001);

        suzu.displayInfo();
        suzu.startEngine();
        suzu.stopEngine();

        int[] guyGrades = {4,3,3,4,5,4};
        Student guy = new Student("Hugh Mann",guyGrades);
        System.out.printf("%s's grade average: %.2f\n",guy.name, guy.calculateAverage());
    }
}

class Car{
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.printf("%s %s (%d)\n", brand, model, year);
    }

    public void startEngine(){
        System.out.println("The car is starting!");
    }

    public void stopEngine(){
        System.out.println("The car is stopping!");
    }
}

class Student{
    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.grades = grades;
        this.name = name;
    }

    public double calculateAverage(){
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }
}
