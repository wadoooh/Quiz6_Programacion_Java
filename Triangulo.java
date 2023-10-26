class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo( String nombre, String color, double base, double altura) {
        super  (nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area=   (base * altura)/2;
        System.out.println("Area: " + area);
        return  area;
    }

    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double  perimetro= base*3;
        System.out.println("Perimetro: " +  perimetro);
        return  perimetro;
    }
}
