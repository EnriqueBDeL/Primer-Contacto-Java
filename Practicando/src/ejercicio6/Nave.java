
package ejercicio6;


public class Nave<T> {
    
    private T elemento;

    public void embarcar(T elemento) {
        this.elemento = elemento;
    }
    
    public T desembarcar() {
        T temp = elemento;
        elemento = null;
        return temp;
    }


    
    
    
    
}
