package EjemploInterruptedException;
//Se extiende de Thread:
public class MiThread extends Thread{
    //run() indica que se ejecutará un bucle infinito de tipo while:
    public void run(){
        while (true) {
            //Se escribirá "Ejecuto" en la consola
            System.out.println("Ejecuto");
            try{
            //Se suspende la ejecución durante 100 milisegundos y se muestra por consola "Termino en sleep"
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Termino en sleep");
            }
        }
    }
}
