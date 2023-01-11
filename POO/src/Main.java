public class Main {
    public static void main(String[] args) {

     try {
      Municipio municipio = new Municipio("Santa Fe");
      Propiedad propiedad1 = PropiedadFactory.getInstance().crearPropiedad("Casa");
      Propiedad propiedad2 = PropiedadFactory.getInstance().crearPropiedad("Casa");
      Propiedad propiedad3 = PropiedadFactory.getInstance().crearPropiedad("Barrio Cerrado");

      propiedad1.setCalle("Av. San Martín");
      propiedad1.setNumero(130);
      ((Casa) propiedad1).setMontoImpuesto(500.00);

      propiedad2.setCalle("Mitre");
      propiedad2.setNumero(233);
      ((Casa) propiedad2).setMontoImpuesto(700.00);

      propiedad3.setCalle("Gutierres");
      propiedad3.setNumero(330);
      ((BarrioCerrado) propiedad3).addPropiedad(propiedad1);
      ((BarrioCerrado) propiedad3).addPropiedad(propiedad2);
      ((BarrioCerrado) propiedad3).setMultiplicador(2);
      ((BarrioCerrado) propiedad3).setMontoImpuesto(2500.00);

      municipio.addPropiedad(propiedad1);
      municipio.addPropiedad(propiedad2);
      municipio.addPropiedad(propiedad3);
      municipio.mostrarInformePropiedades();

      Propiedad propiedad4 = PropiedadFactory.getInstance().crearPropiedad("corrupto");
     }
     catch (Exception l ){
      System.out.println(l);
     }
    }
}