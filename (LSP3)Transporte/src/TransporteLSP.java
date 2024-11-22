public class TransporteLSP {
    public static void main(String[] args) {
        Transporte miTransporte1 = new Bicicleta(); 
        Transporte miTransporte2 = new Coche();     

        miTransporte1.mover(); 
        miTransporte2.mover(); 
    }
}