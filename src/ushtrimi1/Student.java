package ushtrimi1;

public class Student extends Person {
    private int nrLendesh;
    private double mesatarja;

    public Student(String emer, String adrese, int nrLendesh, double mesatarja) {
        super(emer, adrese);
        this.nrLendesh = nrLendesh;
        this.mesatarja = mesatarja;
    }

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setNrLendesh(int nrLendesh) {
        this.nrLendesh = nrLendesh;
    }

    public double getMesatarja() {
        return mesatarja;
    }

    public void setMesatarja(double mesatarja) {
        this.mesatarja = mesatarja;
    }

    @Override
    public String toString() {
        return "Student [emer=" + getEmer() + ", adrese=" + getAdrese() + ", nrLendesh=" + nrLendesh + ", mesatarja="
                + mesatarja + "]";
    }
}