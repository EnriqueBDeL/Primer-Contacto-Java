
package ejercicio4;

import java.util.Date;

public class CuentaBancaria {
    
    private double saldo;
    private String titular;
    private String iban;
    private Date fechaApertura;
    
    private static double totalSaldo = 0;

    public CuentaBancaria(double saldo, String titular, String iban, Date fechaApertura, double saldoInicial) {
        this.saldo = saldo;
        this.titular = titular;
        this.iban = iban;
        this.fechaApertura = fechaApertura;
         totalSaldo += saldoInicial;
    }

    
    
/* Devuelve el saldo de una cuenta */
public double saldo(){
    return saldo;
}
        
/* Devuelve la suma de los saldos de todas las cuentas existentes
*/
public static double totalSaldo(){
    
    return totalSaldo;
    
}
        
        
/* Devuelve True si el saldo es negativo, y False en caso
contrario. */
        
        
public boolean enNumerosRojos (){
    
    if (saldo < 0){
        return true;
    }else{
        return false;
    }
    
}
        
        
/* Suma la cantidad pasada como parámetro al saldo actual de la
cuenta */
        
        
public void movimiento(double valor){
    
    saldo = saldo + valor;
    totalSaldo = totalSaldo + valor;
    
}
        
        
/* Imprime el saldo total de todas las cuentas existentes */
public static void imprimirCuentas (){
    
    System.out.println("Saldo Total: " + totalSaldo + " $");
    
}
    
}
