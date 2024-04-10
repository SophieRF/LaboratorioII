package ThreadPorHerencia;

import static java.lang.Thread.sleep;

public class Main {
        public static void main(String[] args){
// Se declaran dos instancias de PingPong, las cuales representan un nuevo Thread cada una:
            PingPong t1 =new PingPong("PING",33);
            PingPong t2= new PingPong("PONG",10);
// Se inicia la ejecución de la instancia y sus respectivos métodos a través de start()
            t1.start();
            t2.start();
// Se indica una pausa de 5000 milisegundos mientras se ejecuta el programa:
            try{ sleep(5000);
            }catch (InterruptedException e){};
/* Para finalizar la ejecución de los threads, se utiliza stop(),
ya que el método declarado en la clase PingPong() es un bucle infinito: */
            t1.stop();
            t2.stop();
        }
    }
