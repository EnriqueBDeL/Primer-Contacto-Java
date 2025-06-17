
package ejercicio8;


abstract class Alumnos extends PersonalDocente{
    
    private int NIA;

    public Alumnos(int NIA, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.NIA = NIA;
    }

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

       @Override
    public String toString() {
        return super.toString() + ", NIA=" + NIA;
    }   
}
