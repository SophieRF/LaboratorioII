package EjemploIsAlive;
class Ejemplo_isAlive {
    public static void main(String[] args){
    //Se crea una instancia de Obrera y se ejecuta con start():
        Obrera agente =new Obrera();
        agente.start();
// Mientras se ejecuta calcula(), se pueden realizar operaciones simultáneas,
// como en este caso las siguientes impresiones:
        System.out.println("Se está realizando el cálculo ...");
        System.out.println("Se avisará cuando el cálculo haya concluido...");
//Espera que agente haya terminado
        while (agente.isAlive()) Thread.yield();
// Se obtiene resultado, que es la variable que contiene el método calcula():
        System.out.println(agente.getResultado());
    }
}