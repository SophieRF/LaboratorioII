package TPRelacionesPte1;

public class Piloto extends Persona implements Volador {
    private int idPiloto;
    public Piloto(int idPiloto, String nombre){
        super(nombre);
        this.idPiloto = idPiloto;
    }
    public int getIdPiloto() {
        return idPiloto;
    }
    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    @Override
    public void volar() {
        System.out.println("El piloto " +getNombre()+ " de ID "+ getIdPiloto()+ " está pilotando el avión ahora mismo");
    }
}
