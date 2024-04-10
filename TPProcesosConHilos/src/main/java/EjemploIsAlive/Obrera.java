package EjemploIsAlive;
//Se extiende de Thread:
public class Obrera extends Thread{
    private String resultado = "No calculado";
    //En este caso, run() ejecutará el método calcula()
    public void run(){
        resultado = calcula();
    }
    private String calcula(){
//Se realiza un cálculo largo que establece una pausa de 10000 milisegundos y retorna un aviso cuando ha concluido:
        try {Thread.sleep(10000);
        } catch(InterruptedException e){};
        return "Ya calculado";
    }
    public String getResultado(){
        return resultado;
    }
}