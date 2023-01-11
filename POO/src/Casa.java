public class Casa extends Propiedad {

   private double montoImpuesto;

    public Casa() {
    }

    @Override
    public double calcularImpuesto() {
        if(getCalle().equals("Av. San Martín")){
            return this.montoImpuesto*1.10;
        }
        return montoImpuesto;
    }

    @Override
    public void mostrar() {
        System.out.println("la calle es: " + getCalle() + ", el numero es: " + getNumero() + " el impuesto es: " + calcularImpuesto() );

    }

    public void setMontoImpuesto(double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }
}


