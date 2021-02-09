package com.company.oop.instantiererdeobiecte;

public class Casa {
    private int nrUsi;
    private int nrGeamuri;
    private int nrHornuri;
    private int nrTigle;
    private boolean hasGaraj;
    private String numeCasa;
    public static String numeCasa2 = "casa statica 2";

    public Casa() {

    }

    public static String getNumeCasa2(){
        return numeCasa2;
    }

    public Casa(int nrUsiInConstructor, int nrHornuri, int nrGeamuri, int nrTigle) {
        nrUsi = nrUsiInConstructor;
        this.nrHornuri = nrHornuri;
        this.nrGeamuri = nrGeamuri;
        this.nrTigle = nrTigle;
    }

    public Casa(int nrUsi, int nrGeamuri, int nrHornuri, int nrTigle, boolean hasGaraj) {
        this.nrUsi = nrUsi;
        this.nrGeamuri = nrGeamuri;
        this.nrHornuri = nrHornuri;
        this.nrTigle = nrTigle;
        this.hasGaraj = hasGaraj;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public Casa setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
        return this;
    }

    public int getNrGeamuri() {
        return nrGeamuri;
    }

    public Casa setNrGeamuri(int nrGeamuri) {
        this.nrGeamuri = nrGeamuri;
        return this;
    }

    public int getNrHornuri() {
        return nrHornuri;
    }

    public Casa setNrHornuri(int nrHornuri) {
        this.nrHornuri = nrHornuri;
        return this;
    }

    public int getNrTigle() {
        return nrTigle;
    }

    public Casa setNrTigle(int nrTigle) {
        this.nrTigle = nrTigle;
        return this;
    }

    public boolean hasGaraj() {
        return hasGaraj;
    }

    public Casa setHasGaraj(boolean hasGaraj) {
        this.hasGaraj = hasGaraj;
        return this;
    }

    public void setNumeCasa(String numeCasa ){
        this.numeCasa = numeCasa;
    }

    public String getNumeCasa(){
        return numeCasa;
    }

}
