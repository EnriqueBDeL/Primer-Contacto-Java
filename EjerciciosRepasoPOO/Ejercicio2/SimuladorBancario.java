package Ejercicio2;

public class SimuladorBancario {

	public static void main(String[] args) {


        CuentaBancaria c1 = new CuentaBancaria("Alice", 100);
        CuentaBancaria c2 = new CuentaBancaria("Bob", 400);

        c1.depositar(300);       
        c2.depositar(500);       

        boolean retiroAlice = c1.retirar(10);      
        boolean retiroBob = c2.retirar(10000);     

        
        System.out.println("Retiro de Alice exitoso: " + retiroAlice);
        System.out.println("Retiro de Bob exitoso: " + retiroBob);
        System.out.println();


        
        double montoTransferencia = 200;
        
        
        
        if (c1.retirar(montoTransferencia)) {
        	
            c2.depositar(montoTransferencia);
            System.out.println("Transferencia de " + montoTransferencia + " de Alice a Bob realizada con éxito.");
            
        } else {
        	
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de Alice.");
            
        }

        
        System.out.println();

        
        System.out.println("Resumen final de cuentas:");
        System.out.println("-----------------------------------");
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Saldo final: " + c1.getSaldo());
        System.out.println("-----------------------------------");
        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Número de cuenta: " + c2.getNumeroCuenta());
        System.out.println("Saldo final: " + c2.getSaldo());
        System.out.println("-----------------------------------");
		
	}

}
