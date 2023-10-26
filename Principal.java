public class Principal {

    public static void main(String[] args) {
        System.out.println("\n--------------------------");
        Circulo circulo= new Circulo( "Circulo", "negro",40);
        circulo.obtenerArea();
        circulo.obtenerPerimetro();
        System.out.println("\n--------------------------");
        Triangulo triangulo= new Triangulo("Triangulo", "blanco", 40,10 );
        triangulo.obtenerArea();
        triangulo.obtenerPerimetro();
        System.out.println("\n--------------------------");
        Rectangulo rectangulo= new Rectangulo("Rectangulo", "amarillo", 22, 38);
        rectangulo.obtenerArea();
        rectangulo.obtenerPerimetro();
    }
