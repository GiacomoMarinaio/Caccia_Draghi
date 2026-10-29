public class Cacciatore {
    private String nome;
    private Thread drago;

    public Cacciatore(String nome){
        this.nome = nome;
    }

    public void lanciaDardi(Thread d){
        for(int i = 1; (i <= 20 ) && (!d.isInterrupted()); i++){
            try {
                Thread.sleep(5);
                d.interrupt();
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main: " + e);
            }
            System.out.println("il cacciatore " + nome +" sta lanciando il dardo = " + i);
        }
    }
}
