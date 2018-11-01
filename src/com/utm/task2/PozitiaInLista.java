package com.utm.task2;

public class PozitiaInLista {

    private   int pozitia=0;
    private   String simbol;

    public PozitiaInLista(int pozitia, String simbol) {
        this.pozitia = pozitia;
        this.simbol = simbol;
    }

    public int getPozitia() {
        return pozitia;
    }

    public String getSimbol() {
        return simbol;
    }
}
