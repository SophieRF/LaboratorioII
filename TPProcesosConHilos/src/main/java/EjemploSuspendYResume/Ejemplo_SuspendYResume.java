package EjemploSuspendYResume;

import java.util.Scanner;

public class Ejemplo_SuspendYResume {

    public static void main(String[] args) {
        // Creamos una instancia de un hilo y lo iniciamos
        Thread miThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Ejecutando hilo: " + i);
                } catch (InterruptedException e) {
                    System.out.println("Hilo interrumpido");
                    break;
                }
            }
        });
        miThread.start();

        // Simulamos una confirmación de cancelación después de un tiempo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Llamamos al procedimiento ConfirmaCancelacion() para suspender el hilo y luego reanudarlo
        ConfirmaCancelacion(miThread);
    }

    public static void ConfirmaCancelacion(Thread elThread) {
        // Suspendemos el hilo
        elThread.suspend();

        // Simulamos una confirmación de cancelación
        boolean debeCancelar = true; // Cambia a false para probar el caso contrario

        // Verificamos si realmente se debe cancelar el hilo
        if (debeCancelar) {
            // Interrumpimos el hilo si se debe cancelar
            elThread.interrupt();
        } else {
            // Continúa el hilo desde donde se suspendió si no se debe cancelar
            elThread.resume();
        }
    }
}