package Ejercicio2;

public class CuentaBancaria {

    private final String numeroCuenta;
    private String titular;
    private double saldo;
    private static int contadorCuentas = 0;


    
    private static String generarNumeroCuenta() {
     
    	contadorCuentas++;
    	
        return String.format("CTA-%04d", contadorCuentas);
        
    }

    public CuentaBancaria(String titular, double saldoInicial) {
       
    	this.numeroCuenta = generarNumeroCuenta();
        this.titular = titular;
       
        
        if (saldoInicial >= 0) {
        
        	this.saldo = saldoInicial;
      
        } else {
       
        	this.saldo = 0.0; 
       
        }
    }
    
    

    public CuentaBancaria(String titular) {
        this(titular, 0.0); 
    }

    
    
    public void depositar(double monto) {
      
    	if (monto > 0) {
          
    		saldo += monto;
        }
    	
    }

    
    
    public boolean retirar(double monto) {
       
    	if (monto > 0 && saldo >= monto) {
           
    		saldo -= monto;
         
            return true;
            
        }
    	
        return false;
    }


    
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
}
