package persona;
import java.util.ArrayList;
import java.util.List;

public class Principal {

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


        int totalEdad=0;
        int totalPersonas=0;

        for (Persona p: lista) {

            if (p.getEdad()>=18) {
                totalEdad+=p.getEdad();
                totalPersonas++;
            }

        }
        System.out.println(totalEdad/totalPersonas);
    }

}
