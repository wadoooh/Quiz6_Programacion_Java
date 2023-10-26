import java.awt.geom.Area;


class FiguraGeometrica {

    private String nombre;
    private String color;



    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public double obtenerArea() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        return 0.0;
    }

    public double obtenerPerimetro() {
        return 0.0;
    }

}
