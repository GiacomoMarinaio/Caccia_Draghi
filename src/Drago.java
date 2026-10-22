public class Drago implements Runnable{
    String nome;
    int numBattiti;

    public Drago(String nome,int numBattiti){
        this.nome = nome;
        this.numBattiti = numBattiti;
    }

    public void run(){
        for(int i = 0; i < numBattiti; i++){
            System.out.println(this.getNome() + "vola " + (i+1));
        }
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumBattiti() {
        return numBattiti;
    }
}
