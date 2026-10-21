package com.mycompany.tema_01_02.MODELO;

import java.time.LocalDate;

public class Prestamos {
    private int numPrest;
    private LocalDate fecPrest;
    private double impPrest;
    private double impReci;
    private String codFPago;

    public Prestamos() {
    }

    public Prestamos(int numPrest, LocalDate fecPrest, double impPrest, double impReci, String codFPago) {
        this.numPrest = numPrest;
        this.fecPrest = fecPrest;
        this.impPrest = impPrest;
        this.impReci = impReci;
        this.codFPago = codFPago;
    }

    public int getNumPrest() {
        return numPrest;
    }

    public void setNumPrest(int numPrest) {
        this.numPrest = numPrest;
    }

    public LocalDate getFecPrest() {
        return fecPrest;
    }

    public void setFecPrest(LocalDate fecPrest) {
        this.fecPrest = fecPrest;
    }

    public double getImpPrest() {
        return impPrest;
    }

    public void setImpPrest(double impPrest) {
        this.impPrest = impPrest;
    }

    public double getImpReci() {
        return impReci;
    }

    public void setImpReci(double impReci) {
        this.impReci = impReci;
    }

    public String getCodFPago() {
        return codFPago;
    }

    public void setCodFPago(String codFPago) {
        this.codFPago = codFPago;
    }

    @Override
    public String toString() {
        return "Prestamos{" + "numPrest=" + numPrest + ", fecPrest=" + fecPrest + ", impPrest=" + impPrest + ", impReci=" + impReci + ", codFPago=" + codFPago + '}';
    }
    

    
    
    
}
