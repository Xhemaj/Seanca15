package ushtrimi1;

public class Pedagog extends Person {
    private int nrLendesh;
    private double paga;

    public Pedagog(String emer, String adrese, int nrLendesh, double paga) {
        super(emer, adrese);
        this.nrLendesh = nrLendesh;
        this.paga = paga;
    }

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setNrLendesh(int nrLendesh) {
        this.nrLendesh = nrLendesh;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Pedagog [emer=" + getEmer() + ", adrese=" + getAdrese() + ", nrLendesh=" + nrLendesh + ", paga=" + paga
                + "]";
    }
}