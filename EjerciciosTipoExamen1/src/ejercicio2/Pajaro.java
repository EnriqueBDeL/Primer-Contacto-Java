
package ejercicio2;


public class Pajaro extends Animal{
    
    private String tipoVuelo;

    public Pajaro(String tipoVuelo, String nombre) {
        super(nombre);
        this.tipoVuelo = tipoVuelo;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    @Override
    public void emitirSonido() {
                System.out.println("Pia el pajaro.");
    }

    @Override
    public void emitirSonido(String estado) {
               System.out.println("Pia el pajaro " + estado + ".");
    }
    
    
}
