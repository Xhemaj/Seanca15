package ushtrimi3;

public class Katrori extends FiguraGjeometrike {
    private double brinja;

    public Katrori(double brinja) {
        this.brinja = brinja;
    }

    public double getBrinja() {
        return brinja;
    }

    public void setBrinja(double brinja) {
        this.brinja = brinja;
    }

    @Override
    public double llogaritPerimetrin() {
        return 4 * brinja;
    }

    @Override
    public double llogaritSiperfaqen() {
        return brinja * brinja;
    }
}