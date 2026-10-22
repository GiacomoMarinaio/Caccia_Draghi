import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimmi quante volte batte le ali:");
        int numBattiti = sc.nextInt();

        Thread giallo = new Thread(new Drago("Stefania ", numBattiti));

        giallo.start();

    }
}