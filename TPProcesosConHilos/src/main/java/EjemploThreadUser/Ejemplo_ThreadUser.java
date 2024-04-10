package EjemploThreadUser;
public class Ejemplo_ThreadUser {
    public static void main(String[] args) {
        // Creamos un nuevo Thread
        Thread hiloUsuario = new Thread(() -> {
            // El código dentro del Thread se ejecuta en paralelo al main
            for (int i = 0; i < 10; i++) {
                System.out.println("Ejecutando hilo: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Iniciamos el Thread
        hiloUsuario.start();

        // El código en el main continúa ejecutándose mientras el Thread está en ejecución
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando main: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Esperamos a que el Thread finalice
        try {
            hiloUsuario.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ambos threads han finalizado");
    }
}
