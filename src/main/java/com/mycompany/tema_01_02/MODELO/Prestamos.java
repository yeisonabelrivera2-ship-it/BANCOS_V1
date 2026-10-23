package com.mycompany.tema_01_02.MODELO;

import java.time.LocalDate;

public class Prestamos {
    private int NUMPREST;
    private LocalDate FECPREST;
    private double IMPPREST;
    private double IMPRECI;
    private String CODFPAGO;

    public Prestamos() {
    }

    public Prestamos(int numPrest, LocalDate fecPrest, double impPrest, double impReci, String codFPago) {
        this.NUMPREST = numPrest;
        this.FECPREST = fecPrest;
        this.IMPPREST = impPrest;
        this.IMPRECI = impReci;
        this.CODFPAGO = codFPago;
    }

    public int getNumPrest() {
        return NUMPREST;
    }

    public void setNumPrest(int numPrest) {
        this.NUMPREST = numPrest;
    }

    public LocalDate getFecPrest() {
        return FECPREST;
    }

    public void setFecPrest(LocalDate fecPrest) {
        this.FECPREST = fecPrest;
    }

    public double getImpPrest() {
        return IMPPREST;
    }

    public void setImpPrest(double impPrest) {
        this.IMPPREST = impPrest;
    }

    public double getImpReci() {
        return IMPRECI;
    }

    public void setImpReci(double impReci) {
        this.IMPRECI = impReci;
    }

    public String getCodFPago() {
        return CODFPAGO;
    }

    public void setCodFPago(String codFPago) {
        this.CODFPAGO = codFPago;
    }

    @Override
    public String toString() {
        return "Prestamos{" + "numPrest=" + NUMPREST + ", fecPrest=" + FECPREST + ", impPrest=" + IMPPREST + ", impReci=" + IMPRECI + ", codFPago=" + CODFPAGO + '}';
    }
    

    
    
    
}
