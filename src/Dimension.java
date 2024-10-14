public class Dimension {

    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension() {
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getvolume() {
        double volumen = 0;
        volumen = (getAncho() * getProfundidad() * getAlto());
        return volumen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimension{");
        sb.append("alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundidad=").append(profundidad);
        sb.append(", Volumen Figura=").append(getvolume());
        sb.append('}');
        return sb.toString();
    }
}
