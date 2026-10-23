public class Drago implements Runnable{
    String nome;
    int numBattiti;

    public Drago(String nome,int numBattiti){
        this.nome = nome;
        this.numBattiti = numBattiti;
    }

    public void run(){
        for(int i = 0; i < numBattiti; i++) {
            System.out.println(this.getNome() + "si libra nell'aria! Gioia immensa, al battito: " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleep error:" + e);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumBattiti() {
        return numBattiti;
    }
}
