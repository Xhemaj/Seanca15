package ushtrimi3;

public class Rrethi extends FiguraGjeometrike {
    private double rreze;

    public Rrethi(double rreze) {
        this.rreze = rreze;
    }

    public double getRreze() {
        return rreze;
    }

    public void setRreze(double rreze) {
        this.rreze = rreze;
    }

    @Override
    public double llogaritPerimetrin() {
        return 2 * Math.PI * rreze;
    }

    @Override
    public double llogaritSiperfaqen() {
        return Math.PI * rreze * rreze;
    }
}