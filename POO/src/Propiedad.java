public abstract class Propiedad {

    private String calle;
    private Integer numero;

    public Propiedad() {
    }

    public abstract double calcularImpuesto();

    public abstract void mostrar();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}


