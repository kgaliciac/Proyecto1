package proyecto1.umg.kathy;

import java.util.ArrayList;

public class ColaServicio {
    
    private static ArrayList<Ticket> cola = new ArrayList();
  
    public void agregar(Ticket ticket1){
        cola.add(ticket1);
    }
    
    public void Mostrar(){
        System.out.println(cola.get(0));
    }
    
}
