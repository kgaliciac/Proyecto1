package proyecto1.umg.kathy;

import java.util.Date;

public class Bitacora {
    private int nitSoporte;
    private Date fechaHora;
    private String mensaje;
    //private TipoEvento evento;
    //constructor
    public Bitacora(int nitSoporte, Date fechaHora, String mensaje/*,TipoEvento evento*/){
        this.nitSoporte = nitSoporte;
        this.fechaHora = fechaHora;
        this.mensaje = mensaje;
        //this.evento = evento;
    }

    public int getNitSoporte() {
        return nitSoporte;
    }

    public void setNitSoporte(int nitSoporte) {
        this.nitSoporte = nitSoporte;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
/*
    public TipoEvento getEvento() {
        return evento;
    }

    public void setEvento(TipoEvento evento) {
        this.evento = evento;
    }*/
    
    @Override
    public String toString(){
        String mensaje = "Ticket se encuentra en cola";
        return "NIT Soporte: " + nitSoporte +
                "  Fehca/Hora: " + fechaHora +
                "  Mensaje: " + mensaje ;
    }
}
