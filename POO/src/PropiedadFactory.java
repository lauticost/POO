public class PropiedadFactory {

    private static PropiedadFactory instance;

    public PropiedadFactory() {
    }

    public static PropiedadFactory getInstance() {
        if (instance == null) {
            instance = new PropiedadFactory();
        }
        return instance;
    }

    public Propiedad crearPropiedad(String codigo) throws Exception {

        switch (codigo) {
            case "Casa":
                return new Casa();
            case "Barrio Cerrado":
                return new BarrioCerrado();
        }
        throw new Exception("Operacion invalida, intente nuevamente");

    }

}
