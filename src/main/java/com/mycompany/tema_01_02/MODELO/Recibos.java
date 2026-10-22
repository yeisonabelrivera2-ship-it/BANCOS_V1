
package com.mycompany.tema_01_02.MODELO;

import java.time.LocalDate;

public class Recibos {
    
    private int NNUMPREST;
    private int NNUMRECIB;
    private LocalDate DFECREC;
    private int NIMPREC;
    private LocalDate DFECPAGO;

    
    public Recibos() {
    }

    public Recibos(int NNUMPREST, int NNUMRECIB, LocalDate DFECREC, int NIMPREC, LocalDate DFECPAGO) {
        this.NNUMPREST = NNUMPREST;
        this.NNUMRECIB = NNUMRECIB;
        this.DFECREC = DFECREC;
        this.NIMPREC = NIMPREC;
        this.DFECPAGO = DFECPAGO;
    }

    public int getNNUMPREST() {
        return NNUMPREST;
    }

    public int getNNUMRECIB() {
        return NNUMRECIB;
    }

    public LocalDate getDFECREC() {
        return DFECREC;
    }

    public int getNIMPREC() {
        return NIMPREC;
    }

    public LocalDate getDFECPAGO() {
        return DFECPAGO;
    }

    public void setNNUMPREST(int NNUMPREST) {
        this.NNUMPREST = NNUMPREST;
    }

    public void setNNUMRECIB(int NNUMRECIB) {
        this.NNUMRECIB = NNUMRECIB;
    }

    public void setDFECREC(LocalDate DFECREC) {
        this.DFECREC = DFECREC;
    }

    public void setNIMPREC(int NIMPREC) {
        this.NIMPREC = NIMPREC;
    }

    public void setDFECPAGO(LocalDate DFECPAGO) {
        this.DFECPAGO = DFECPAGO;
    }

    @Override
    public String toString() {
        return "Recibos{" + "NNUMPREST=" + NNUMPREST + ", NNUMRECIB=" + NNUMRECIB + ", DFECREC=" + DFECREC + ", NIMPREC=" + NIMPREC + ", DFECPAGO=" + DFECPAGO + '}';
    }
    
     
    
}
