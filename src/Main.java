import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wgadaj liczbe");
        for (int i = 10; i <=50; i+=10) {
            letsPlay(i);
        }
        System.out.println("Gratuluje. Wygralesz");
        sc.close();
    }
    private static void letsPlay(int range){
        int number = (int) (Math.random()*range);
        while (true){
            System.out.println("Enter number 0..."+range);
            int inNumber = sc.nextInt();
            if (inNumber==number){
                System.out.println("Wgadalesz");
                break;
            } else if (inNumber<number){
                System.out.println("Liczba wieksza");
            } else {
                System.out.println("Liczba mnniejsza");
            }
        }

    }
}
