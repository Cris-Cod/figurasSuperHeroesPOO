import java.util.ArrayList;
import java.util.List;

public class Coleccion {

    private String nombreColeccion;
    private List<Figura> listaFiguras  = new ArrayList<>();

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void addFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        for(Figura figuras : listaFiguras){
            if(figuras.getCodigo().equalsIgnoreCase(id)){
               double nuevoPrecio = figuras.getPrecio() + cantidad;
               figuras.setPrecio(nuevoPrecio);
            }
        }
    }

    public void mostrarFiguras(){
        for (Figura figura : listaFiguras){
            System.out.println(figura);
        }
    }

    public void superHeroeConCapa(){
        for (Figura figura : listaFiguras){
            if(figura.getSuperHeroe().isCapa()){
                System.out.println("Figuras con Capa: " + figura.getSuperHeroe().getNombre());
            }
        }
    }

    public double masValioso(){
       double mayorPrecio = 0;
       for (Figura figura : listaFiguras){
           if(figura.getPrecio() > mayorPrecio){
               mayorPrecio = figura.getPrecio();
           }
       }
        return mayorPrecio;
    }

    public double getValorColeccion(){
        double totalPrecio = 0;
        for (Figura figura : listaFiguras){
            totalPrecio += figura.getPrecio();
        }
        return totalPrecio;
    }

    public double getVolumenColeccion(){
        double valorVolumen = 0;
        for (Figura figura : listaFiguras){
            valorVolumen += figura.getDimension().getvolume();
        }
        return  valorVolumen + 200;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coleccion{");
        sb.append("nombreColeccion='").append(nombreColeccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
