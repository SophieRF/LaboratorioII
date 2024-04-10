public class Filosofo extends Thread{
    private Mesa mesa;
    private int filosofo;
    private int indiceFilosofo;
    public Filosofo(Mesa mesa, int filosofo){
        this.mesa = mesa;
        this.filosofo = filosofo;
        this.indiceFilosofo = filosofo -1;
    }
    public void run(){
        while (true){
            this.pensando();
            this.mesa.tomarTenedores(this.indiceFilosofo);
            this.comiendo();
            this.mesa.dejarTenedores(this.indiceFilosofo);
        }
    }
    public void pensando(){
        System.out.println("El filósofo "+ filosofo + " esta pensando");
        try {
            sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Error "+ e);
        }
    }
    public void comiendo(){
        System.out.println("Filósofo "+ filosofo + " comiendo");
        try {
            sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Error: " + e);
        }
    }
}
