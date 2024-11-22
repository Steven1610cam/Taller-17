public class CuentaBancariaLSP {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaAhorros(1000, 0.05); 

        System.out.println("Saldo inicial: " + miCuenta.getSaldo());
        miCuenta.depositar(500); 
        System.out.println("Saldo después del depósito: " + miCuenta.getSaldo());
        miCuenta.retirar(200); 
        System.out.println("Saldo después del retiro: " + miCuenta.getSaldo());

        
        ((CuentaAhorros) miCuenta).aplicarInteres();
        System.out.println("Saldo después de aplicar interés: " + miCuenta.getSaldo());
    }
}