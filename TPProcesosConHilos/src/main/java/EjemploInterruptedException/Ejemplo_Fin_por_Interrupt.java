package EjemploInterruptedException;
public class Ejemplo_Fin_por_Interrupt {
    public static void main(String[] args) {
        //Se instancia MiThread() y se ejecuta mediante .start():
        Thread elThread = new MiThread();
        elThread.start();
        try {
        //Antes de iniciar el método interrupt() se espera 1000 milisegundos mediante sleep()
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        };
        /*Al invocarse interrupt() la instancia puede encontrarse en estado runneable o sleeping (ejecutándose, o en pausa),
        si está runneable pasa al estado Interrupted y cuando se invoca el método sleep() pasa al estado Sleeping y en ese
        momento se eleva InterruptedException, escribe el comentario y finaliza la instancia elThread.
         Si por el contrario la instancia ya se encuentra en estado Sleeping, entonces solamente se eleva InterruptedException,
        se escribe el comentario y finaliza la instancia*/
        elThread.interrupt();
    }
}