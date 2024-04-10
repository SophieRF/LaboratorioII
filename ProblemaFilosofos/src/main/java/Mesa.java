public class Mesa {
    private boolean[] tenedores;
    public Mesa(int numeroTenedores){
        this.tenedores = new boolean[numeroTenedores];
    }
    public int tenedorIzquierdo(int i){
        return i;
    }
    public int tenedorDerecho(int i){
        if(i == 0){
            return this.tenedores.length -1;
        }else {
            return i - 1;
        }
    }
    public synchronized void tomarTenedores(int filosofo){
        while (tenedores[tenedorDerecho(filosofo)] || tenedores[(tenedorIzquierdo(filosofo))]) {
            try {
                wait();
        }catch(InterruptedException e){
                System.out.println("Error: "+ e);
            }
        }
        tenedores[tenedorIzquierdo(filosofo)] = true;
        tenedores[tenedorDerecho(filosofo)] = true;
    }
    public synchronized void dejarTenedores(int filosofo){
        tenedores[tenedorIzquierdo(filosofo)] = false;
        tenedores[tenedorDerecho(filosofo)] = false;
        notifyAll();
    }
}
