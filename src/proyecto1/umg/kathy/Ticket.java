package proyecto1.umg.kathy;

import java.util.ArrayList;

public class Ticket{
    private String nitUsuario;
    private int id;
    private String problema;
    private String estado;
    ArrayList<Bitacora> bitacora;
    //nuestro constructor
    public Ticket(int id, String nitUsuario, String problema, String estado){
        this.id = id;
        this.nitUsuario = nitUsuario;
        this.problema = problema;
        this.estado = estado;
       bitacora = new ArrayList();
    }
    
    public void addBitacora(Bitacora bi){
        bitacora.add(bi);
    }

    public String getNitUsuario() {
        return nitUsuario;
    }

    public void setNitUsuario(String nitUsuario) {
        this.nitUsuario = nitUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "\nId: " +this.id+ "  \nNit Usuario: " + this.nitUsuario +"  \nProblema: " + this.problema +"  \nCola: " + this.estado +
                "\nBitacora: " + bitacora;
    }
}  
