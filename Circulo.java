class  Circulo extends FiguraGeometrica {

    private  double radio;

    public Circulo( String nombre, String color, double radio) {
        super  (nombre, color);
        this.radio=radio;

    }


    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area= Math.PI * radio * radio;
        System.out.println("Area: " + area);
        return  area;
    }


    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double  perimetro= 2 * Math.PI * radio;
        System.out.println("Perimetro: " +  perimetro);
        return  perimetro;
    }
}
