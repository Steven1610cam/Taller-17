public class CuentaAhorros extends CuentaBancaria {
    private double interes;

    public CuentaAhorros(double saldoInicial, double interes) {
        super(saldoInicial);
        this.interes = interes;
    }

    public void aplicarInteres() {
        double saldoActual = getSaldo();
        depositar(saldoActual * interes); 
    }
}