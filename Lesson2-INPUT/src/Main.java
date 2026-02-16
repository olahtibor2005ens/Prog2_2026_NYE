import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az aktuális hőmérsékletet: ");
        temp = sc.nextFloat();
        if(temp < 0.0f){
            System.out.println("Fagypont alatti!");
        }else if(temp > 30.0f){
            System.out.println("Túl Meleg!");
        }else{
            System.out.println("Átlagos Hőmérséklet.");
        }



        float time = -1f;
        while(time < 0){
            System.out.println("Villámlás után hány másodperccel hallotta a dörgést?");
            time = sc.nextFloat();
        }
        float distance = time * 300;
        System.out.printf("A villám %.2f méterre csapódott be.\n", distance);



        int age = 0;
        while(age < 1 || age > 20){
            System.out.println("Hány éves vagy? (1-20 között): ");
            age = sc.nextInt();
        }
        for (int i = 0; i < age; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < age; i++){
            System.out.print("| ");
        }
        System.out.println();
        for (int i = 0; i < age; i++){
            System.out.print("~~");
        }
        System.out.println();
        sc.close();



    }
}