package TPRelacionesPte1;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("LV-X");
        Vuelo vuelo1 = new Vuelo(01);
        Piloto piloto1 = new Piloto(45002,"Juan Mendez");
        vuelo1.establecerVuelo(avion1);
        piloto1.volar();
    }
}
