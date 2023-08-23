package ushtrimi3;

public class Drejtkendeshi extends FiguraGjeometrike {
    private double gjatesia;
    private double gjeresia;

    public Drejtkendeshi(double gjatesia, double gjeresia) {
        this.gjatesia = gjatesia;
        this.gjeresia = gjeresia;
    }

    public double getGjatesia() {
        return gjatesia;
    }

    public void setGjatesia(double gjatesia) {
        this.gjatesia = gjatesia;
    }

    public double getGjeresia() {
        return gjeresia;
    }

    public void setGjeresia(double gjeresia) {
        this.gjeresia = gjeresia;
    }

    @Override
    public double llogaritPerimetrin() {
        return 2 * (gjatesia + gjeresia);
    }

    @Override
    public double llogaritSiperfaqen() {
        return gjatesia * gjeresia;
    }
}
