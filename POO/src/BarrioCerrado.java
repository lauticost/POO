import java.util.*;

public class BarrioCerrado extends Propiedad{

    private int multiplicador;
    private List<Propiedad> propiedades;
    private double montoImpuesto;

    public BarrioCerrado() {
        propiedades = new ArrayList<>() ; }

    @Override
    public double calcularImpuesto() {
        Double impuestoFinal = 0.0;
        for (Propiedad casa:propiedades) {
            impuestoFinal += casa.calcularImpuesto();
        }
        return impuestoFinal * multiplicador;
    }

    @Override
    public void mostrar() {
        System.out.println("la calle correcta es: " + getCalle() + ", altura de la calle: " + getNumero() + " tiene un impuesto de: " + calcularImpuesto() );
    }

    public void addPropiedad(Propiedad unaPropiedad){
        propiedades.add(unaPropiedad);
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public void setMontoImpuesto(double montoImpuesto) { this.montoImpuesto = montoImpuesto;}
}

