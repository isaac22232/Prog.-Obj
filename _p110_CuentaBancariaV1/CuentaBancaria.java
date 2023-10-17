package _p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double saldo;
    

    public CuentaBancaria(double Saldo){
        Saldo = saldo;
    }

    public void deposita(double cantidad){
        saldo = saldo + cantidad;
    }

    public double getSaldo() {
        return saldo;
        }
        public boolean retira(double cantidad) {
        if( saldo >= cantidad) {
        saldo -= cantidad;
        return true;
        }
        else
        return false;
        }
}
