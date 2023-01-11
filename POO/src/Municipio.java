import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private String nombre;
    private List<Propiedad> listapropiedades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        listapropiedades = new ArrayList<>();
    }

    public void mostrarInformePropiedades() {
        for (Propiedad item : listapropiedades) {
            item.mostrar();
        }

    }
    public void addPropiedad(Propiedad unaPropiedad){
        listapropiedades.add(unaPropiedad);
    }
}
