package ushtrimi2;

public class Rreth {
    private double rreze;
    private String ngjyre;

    public Rreth() {
        this(1.0, "blu");
    }

    public Rreth(double rreze, String ngjyre) {
        this.rreze = rreze;
        this.ngjyre = ngjyre;
    }

    public double getRreze() {
        return rreze;
    }

    public void setRreze(double rreze) {
        this.rreze = rreze;
    }

    public String getNgjyre() {
        return ngjyre;
    }

    public void setNgjyre(String ngjyre) {
        this.ngjyre = ngjyre;
    }

    public double llogaritSiperfaqen() {
        return Math.PI * rreze * rreze;
    }
}