package _p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {
    private double TasaInteres;

    public CuentaDeAhorro(double saldo, double tasaInteres) {
        super(saldo);
        TasaInteres = tasaInteres;
    }

    public void calcularInteres(){
        Saldo += Saldo * TasaInteres;
    }

    @Override
    public boolean retira(double cantidad) {
           if(Saldo >= cantidad){
            Saldo-= cantidad;       
        return false;
        } else return false;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro [ "+ super.toString() + ", TasaInteres=" + TasaInteres + "]";
    }


   

  
}
