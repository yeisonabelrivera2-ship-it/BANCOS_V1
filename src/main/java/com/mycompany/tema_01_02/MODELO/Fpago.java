
package com.mycompany.tema_01_02.MODELO;

public class Fpago {

    private String CCODFPAGO;   
    private String CDESFPAGO; 
    private long NRECIBOS;

    public Fpago(String CCODFPAGO, String CDESFPAGO, long NRECIBOS) {
        this.CCODFPAGO = CCODFPAGO;
        this.CDESFPAGO = CDESFPAGO;
        this.NRECIBOS = NRECIBOS;
    }
    
    public Fpago()
    {}

    public String getCCODFPAGO() {
        return CCODFPAGO;
    }

    public void setCCODFPAGO(String CCODFPAGO) {
        this.CCODFPAGO = CCODFPAGO;
    }

    public String getCDESFPAGO() {
        return CDESFPAGO;
    }

    public void setCDESFPAGO(String CDESFPAGO) {
        this.CDESFPAGO = CDESFPAGO;
    }

    public long getNRECIBOS() {
        return NRECIBOS;
    }

    public void setNRECIBOS(long NRECIBOS) {
        this.NRECIBOS = NRECIBOS;
    }

    @Override
    public String toString() {
        return CDESFPAGO;
    }
    
    
    
}
