public class FiguraLSP {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5); 
        Figura miRectangulo = new Rectangulo(4, 6); 

        System.out.println("Área del círculo: " + miCirculo.area()); 
        System.out.println("Área del rectángulo: " + miRectangulo.area()); 
    }
}