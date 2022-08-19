package persona;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Principal2 {
    public static void main(String[] args) {

        Persona p1= new Persona("pepe",20);
        Persona p2= new Persona("juan",12);
        Persona p3= new Persona("angela",30);
        Persona p4= new Persona("gema",40);
        Persona p5= new Persona("david",15);

        List<Persona> lista=new ArrayList<Persona>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        OptionalDouble resultado=lista.stream().filter(persona->persona.getEdad()>=18)
                .mapToInt(persona->persona.getEdad())
                .average();
        if(resultado.isPresent()) {

            System.out.println(resultado.getAsDouble());
        }

    }
}
