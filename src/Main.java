import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimmi quante volte batte le ali:");
        int numBattiti = sc.nextInt();
        Cacciatore sangiorgio = new Cacciatore("Yugi Muto");

        Thread giallo = new Thread(new Drago("Drago Bianco Polvere di Stelle ", numBattiti));
        giallo.start();

        sangiorgio.lanciaDardi(giallo);

        for(int i = 0; i <= 10; i++){
            System.out.println("main sta osservando il drago... i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //System.out.println(e);
                throw new RuntimeException(e);
            }
        }

    }
}