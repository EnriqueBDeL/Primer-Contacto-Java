
package ejercicio5;



public class Main {

    
    public static void main(String[] args) {

        FehcaConHora fechaHora = new FehcaConHora( 15, 30, 45, 17, 6, 2025);
        FechaConZonaHoraria fechaZona = new FechaConZonaHoraria(17, 6, 2025, +2);

        System.out.println(fechaHora);  
        System.out.println(fechaZona);  

        System.out.println("Día fechaHora: " + fechaHora.getDia());
        System.out.println("Mes fechaZona: " + fechaZona.getMes());
        System.out.println("Año fechaHora: " + fechaHora.getAno());  
    }
    
}
