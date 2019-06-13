package com.example.myapplication.entidades;

public class Cita implements Repetible {

    private Cliente cliente;
    private Entrenador entrenador;
    private String direccion;
    private RutinaDia rutinaDia;
    private String fechaHora;
    private boolean faltoClase;

    public Cita(Cliente cliente, Entrenador entrenador, String direccion, RutinaDia rutinaDia, String fechaHora, boolean faltoClase) {
        this.cliente = cliente;
        this.entrenador = entrenador;
        this.direccion = direccion;
        this.rutinaDia = rutinaDia;
        this.fechaHora = fechaHora;
        this.faltoClase = faltoClase;
    }

    private String falta()
    {
        String msg = "";
        if(faltoClase=true) msg="No falto a la cita";
        else msg = "Falto a la cita";
        return msg;

    }

    @Override
    public String MostrarInfo() {
        return "Detalle de la cita: "+"\n"+
                "Nombre del cliente: "+cliente.nombre+"\n"+
                "Nombre del entrenador: "+entrenador.nombre+"\n"+
                "Direccion: "+direccion+"\n"+
                "Rutina: "+rutinaDia.nombre+"\n"+
                "Fecha y hora:"+fechaHora+"\n"+
                "Falto a clase: "+falta();
    }
}
