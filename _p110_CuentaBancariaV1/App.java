package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");System.out.flush();
        
        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo Inicial : " + cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo depositado : " + cuenta1.getSaldo());
        double cretiro = 200;
        boolean retiro = cuenta1.retira(cretiro);
        if(retiro) System.out.println("Retiro de " + cretiro + " efectuado con éxito, nuevo saldo " + cuenta1.getSaldo());
        else System.out.println("Ni para los cigarros tienes");



        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Margarito Perez", cuenta1);
        System.out.println("Cliente 1 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castaneda", new CuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);
        
        cliente2.getCuenta().deposita(8500);
        System.out.println("Cliente 2 : despues del deposito de 8500 : " + cliente2);
        if( cliente2.getCuenta().retira(2000) )
            System.out.println("El retiro de 2000 efectuado con exito, nuevo saldo " + cliente2.getCuenta().getSaldo());
        else System.out.println("No money man :( ");

        System.out.println("\nProbando clase bnaco");
        Banco miBanco = new Banco("Banco perejil SA de CV", "Calle las Escondidas S/N");
        miBanco.agregarClientes(cliente1);
        miBanco.agregarClientes(cliente2);
        miBanco.agregarClientes(new Cliente("Felipe Correo", new CuentaBancaria(2000)));
        miBanco.getClientes().get(0).getCuenta().deposita(1500);
        miBanco.getClientes().get(1).getCuenta().retira(1000);
        miBanco.getClientes().get(2).getCuenta().deposita(12000);
        double totalbanco = 0;
        for (Cliente  cliente : miBanco.getClientes()) {
            System.out.println(cliente);
            totalbanco = totalbanco + cliente.getCuenta().getSaldo();
        }
        System.out.println("Total de dinero en el banco : " + totalbanco);
    }
}
