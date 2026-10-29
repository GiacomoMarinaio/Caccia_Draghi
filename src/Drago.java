public class Drago implements Runnable{
    String nome;
    int numBattiti;

    public Drago(String nome,int numBattiti){
        this.nome = nome;
        this.numBattiti = numBattiti;
    }

    public void run(){
        while(!Thread.interrupted()){
            for(int i = 0; (i < numBattiti) && !Thread.interrupted(); i++) {
                System.out.println(this.getNome() + "si libra nell'aria! Gioia immensa, al battito: " + (i + 1));
            }
        }

    }

    public String getNome() {
        return nome;
    }

}
