package TPRelacionesPte1;

import java.util.ArrayList;

public class Flota {
    private ArrayList<Avion> aviones;

    public Flota() {
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }
}
