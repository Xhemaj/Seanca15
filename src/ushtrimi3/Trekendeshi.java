package ushtrimi3;

public class Trekendeshi extends FiguraGjeometrike {
    private double brinjaA;
    private double brinjaB;
    private double brinjaC;
    private int lloji;

    public Trekendeshi(double brinjaA, double brinjaB, double brinjaC, int lloji) {
        this.brinjaA = brinjaA;
        this.brinjaB = brinjaB;
        this.brinjaC = brinjaC;
        this.lloji = lloji;
    }

    public double getBrinjaA() {
        return brinjaA;
    }

    public void setBrinjaA(double brinjaA) {
        this.brinjaA = brinjaA;
    }

    public double getBrinjaB() {
        return brinjaB;
    }

    public void setBrinjaB(double brinjaB) {
        this.brinjaB = brinjaB;
    }

    public double getBrinjaC() {
        return brinjaC;
    }

    public void setBrinjaC(double brinjaC) {
        this.brinjaC = brinjaC;
    }

    public int getLloji() {
        return lloji;
    }

    public void setLloji(int lloji) {
        this.lloji = lloji;
    }

    @Override
    public double llogaritPerimetrin() {
        return brinjaA + brinjaB + brinjaC;
    }

    @Override
    public double llogaritSiperfaqen() {
        double p = llogaritPerimetrin() / 2;
        return Math.sqrt(p * (p - brinjaA) * (p - brinjaB) * (p - brinjaC));
    }
}
