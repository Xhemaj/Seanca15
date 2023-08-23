package ushtrimi2;

public class Test {
    public static void main(String[] args) {
        // Testimi i klasës Rreth
        Rreth rreth1 = new Rreth();
        System.out.println("Rreth 1:");
        System.out.println("Rreza: " + rreth1.getRreze());
        System.out.println("Ngjyra: " + rreth1.getNgjyre());
        System.out.println("Siperfaqja: " + rreth1.llogaritSiperfaqen());

        Rreth rreth2 = new Rreth(2.5, "kuqe");
        System.out.println("\nRreth 2:");
        System.out.println("Rreza: " + rreth2.getRreze());
        System.out.println("Ngjyra: " + rreth2.getNgjyre());
        System.out.println("Siperfaqja: " + rreth2.llogaritSiperfaqen());

        // Testimi i klasës Cilinder
        Cilinder cilinder1 = new Cilinder();
        System.out.println("\nCilinder 1:");
        System.out.println("Rreza: " + cilinder1.getRreze());
        System.out.println("Ngjyra: " + cilinder1.getNgjyre());
        System.out.println("Lartesi: " + cilinder1.getlartesi());
        System.out.println("Siperfaqja: " + cilinder1.llogaritSiperfaqen());
        System.out.println("Vellimi: " + cilinder1.llogaritVellimin());

        Cilinder cilinder2 = new Cilinder(3.0, "e zeze", 5.0);
        System.out.println("\nCilinder 2:");
        System.out.println("Rreza: " + cilinder2.getRreze());
        System.out.println("Ngjyra: " + cilinder2.getNgjyre());
        System.out.println("Lartesi: " + cilinder2.getlartesi());
        System.out.println("Siperfaqja: " + cilinder2.llogaritSiperfaqen());
        System.out.println("Vellimi: " + cilinder2.llogaritVellimin());
    }
}