
package ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Principal {

   
    public static void main(String[] args) {

        Personaje luke = new Personaje("Luke Skywalker", Bando.JEDI);
        Personaje vader = new Personaje("Darth Vader", Bando.SITH);
        Personaje leia = new Personaje("Leia Organa", Bando.REBELDE);
        Personaje palpatine = new Personaje("Emperor Palpatine", Bando.SITH);
        Personaje han = new Personaje("Han Solo", Bando.REBELDE);
        Personaje tarkin = new Personaje("Grand Moff Tarkin", Bando.IMPERIO);

        Nave<Personaje> nave1 = new Nave<>();
        nave1.embarcar(luke);

        Nave<Personaje> nave2 = new Nave<>();
        nave2.embarcar(vader);

        Nave<Personaje> nave3 = new Nave<>();
        nave3.embarcar(leia);

        Nave<Personaje> nave4 = new Nave<>();
        nave4.embarcar(palpatine);

        Nave<Personaje> nave5 = new Nave<>();
        nave5.embarcar(han);

        Nave<Personaje> nave6 = new Nave<>();
        nave6.embarcar(tarkin);
        
        List<Nave<Personaje>> angar = new ArrayList<>();

        angar.add(nave1);
        angar.add(nave2);
        angar.add(nave3);
        angar.add(nave4);
        angar.add(nave5);
        angar.add(nave6);
        
        for(Nave<Personaje> tripulantes : angar){
            
            System.out.println(tripulantes.desembarcar());
            
        }
        
    }
    
}
