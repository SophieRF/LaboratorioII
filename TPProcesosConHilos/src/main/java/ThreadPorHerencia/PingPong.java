package ThreadPorHerencia;
//Se extiende de la clase Thread:
//Thread nos permite realizar ejecuciones simultaneas en un mismo programa
public class PingPong extends Thread{
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras
    public PingPong(String queDecir,int cadaCuantosMs){
    /*queDecir indicará lo que se va a mostrar por consola en la ejecución
    y cadaCuantosMs define los milisegundos que tardará queDecir en mostrarse*/
        word = queDecir; delay = cadaCuantosMs; };
    //Run() define aquello que va a ejecutarse cuando se realice una instancia de la clase:
    public void run(){
        while(true){
        /*En este bucle se define el atributo word y se suspende durante milisegundos
        definidos por delay a través de sleep*/
            System.out.print(word + " ");
            // Se ejecuta un try-catch, que actúa en caso de encontrar un error en la ejecución, retornando ese error:
            try{
                sleep(delay);
            } catch(InterruptedException e){ return; }
        }
    }
}