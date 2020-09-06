package proyecto1.umg.kathy;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    
    private static ArrayList<ColaServicio> servicio = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    JSONParser parser = new JSONParser();
    
    public static void main(String[] args) {
        
        System.out.println("************PROYECTO 1 (OTRS)************");
        // menu que elegira el usuario
        int opcion = 0;
        do{
            System.out.println("\n1...........Nuevo Ticket");
            System.out.println("2...........Tickets Ingresados");
            System.out.println("3...........Total de Tickets");
            System.out.println("4...........Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = sc. nextInt();
            //datos solicitados al usuario
            switch (opcion){
                case 1:
                    int id = 0;
                    id++;
                    String nit,problema,cola;
                    System.out.println("\n\tIngrese los siguientes datos");
                    System.out.print("Nit:  ");
                    nit  = sc.next();
                    System.out.print("Problema:  ");
                    problema = sc.next();
                    System.out.print("Cola: ");
                    cola = sc.next();
                    
                    Ticket ticket = new Ticket(id,nit, problema, cola);
                    
                    Date fecha = new Date();
                    int random = 0;
                    random = (int) (Math.random() *1000);
                   
                    ticket.addBitacora(new Bitacora(random, fecha, " "));
                    
                    
                                Ingresar(ticket);
                    break;
                case 2:
                        mostrarIngresados();
                        break;
                case 3:
                    MostrarTickets();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        } while(opcion !=4);
    }
    
    public static void Ingresar(Ticket ticket3){
        ColaServicio cola = new ColaServicio();
        cola.agregar(ticket3);
        servicio.add(cola);
    }
    
    public static void mostrarIngresados(){
        //System.out.println(""+servicio);
        servicio.get(0).Mostrar();
    }
    //Se agregan ticket nuevos ingresados por el usuario para mostrarlos
    public static void agregar(int id, Ticket ticket1){
        if(id < servicio.size()){
            servicio.get(id).agregar(ticket1);
        }else{
            System.out.println("ERROR");
        }
        
        System.out.println(servicio);
        for(int i = 0; i < servicio.size(); i++){
            System.out.println(servicio.get(i));
        } 
    }
    //Esta funcion nos sirve para correr el archivo json
    public static void MostrarTickets(){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("informacion.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("JSON LEIDO: " + jsonObject);
            
            JSONArray array = (JSONArray) jsonObject.get("Informacion");
            System.out.println("");
            
            for(int i = 0; i < array.size() ; i++) {
                JSONObject jsonObject1 = (JSONObject) array.get(i);
                
                System.out.println("Ticket: " + jsonObject1.get("ticket"));
                System.out.println("Nit Usuario: " + jsonObject1.get("nitUsuario"));
                System.out.println("Problema: " + jsonObject1.get("problema"));
                System.out.println("Cola: " + jsonObject1.get("cola"));
                System.out.println("");
            }
        } catch(FileNotFoundException e) {
        
        }catch(IOException e) {
        
        }catch(ParseException e) {
        
        }
    }
}
