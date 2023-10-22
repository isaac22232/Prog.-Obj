package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Banco de mi casa SA de CV", "mi casa");
        System.out.println("\033[0H\033[2J");System.out.flush();
        miBanco.reporte();
        miBanco.agregarClientes(new Cliente("Carlos Fuentes"));
        miBanco.agregarClientes(new Cliente("Juan de la fuente"));
        miBanco.agregarClientes(new Cliente("Rene Mayorga"));
        miBanco.agregarClientes(new Cliente("Maria Vazquez"));
        miBanco.reporte();
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeCheques(1000, 500));
        miBanco.getClientes().get(1).agregarCuentas(new CuentaDeCheques(2500, 500));
        miBanco.getClientes().get(2).agregarCuentas(new CuentaDeCheques(2000, 600));
        miBanco.getClientes().get(2).agregarCuentas(new CuentaDeAhorro(2000, 0.40));
        miBanco.reporte();
        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        miBanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        miBanco.reporte();
        miBanco.calcularInteres();
        miBanco.reporte();
    }
}
