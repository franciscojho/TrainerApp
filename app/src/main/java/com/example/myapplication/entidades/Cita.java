package com.example.myapplication.entidades;

public class Cita implements Mostrable {

    private String address;
    private int day, month, year, hour, minutes, seconds;
    private String trainingType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDay(int dayOfMonth) {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth(int month) {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear(int year) {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }



    @Override
    public String MostrarInfo() {
        return ""; /*"Detalle de la cita: "+"\n"+
                "Direccion: "+address+"\n"+
                "Fecha: "+date+"\n"+
                "Hora:"+time+"\n"+
                "Falto a clase: "+falta();*/
    }
}
