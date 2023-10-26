class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
/**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(  String nombre, String color, double lado1, double lado2) {
        super  (nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area= lado1 * lado2;
        System.out.println("Area: " + area);
        return  area;
    }

    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double  perimetro= 2 * (lado1 + lado2);
        System.out.println("Perimetro: " +  perimetro);
        return  perimetro;
    }
}
