import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length >= 3){
            try{
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);

                switch (args[0]){
                    case "összeadás" :
                        System.out.printf("%d+%d=%d\n", a, b, a+b);
                        break;
                    case "kivonás" :
                        System.out.printf("%d-%d=%d\n", a, b, a-b);
                        break;
                    case "szorzás" :
                        System.out.printf("%d*%d=%d\n", a, b, a*b);
                        break;
                    case "osztás" :
                        if(b == 0){
                            System.err.println("Nullával való osztás!");
                        }else{
                            System.out.printf("%d/%d=%.2f\n", a, b, (double) a/b);
                        }
                        break;
                    default:
                        System.err.println("Hibás művelet argumentum!");
                }


            }catch (NumberFormatException e){
                System.err.println("Hibás szám argumentumok!");
            }
        }else{
            System.err.println("Nincs elég argumentum a számológéphez!");
        }

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int comNum = r.nextInt(1,101);
        int playerGuess = 0;
        int guesses = 0;

        while(playerGuess != comNum){
            System.out.println("Találja ki a számot amire gondoltam! (1-100)");
            playerGuess = sc.nextInt();
            if(playerGuess > comNum){
                System.out.println("Kisebb!");
            }else if(playerGuess < comNum) {
                System.out.println("Nagyobb!");
            }
            guesses++;
        }

        System.out.printf("Gratulálok! A szám %d volt! %d próbálkozás volt kitalálni!", comNum, guesses);

    }
}