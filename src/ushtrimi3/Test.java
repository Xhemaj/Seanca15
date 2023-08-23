package ushtrimi3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zgjidhni formën gjeometrike:");
        System.out.println("1. Katror");
        System.out.println("2. Drejtkëndësh");
        System.out.println("3. Trekëndësh");
        System.out.println("4. Rreth");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Shkruani brinjën e katrorit: ");
            double brinja = input.nextDouble();
            FiguraGjeometrike figura = new Katrori(brinja);
            printoTeDhenat(figura);
        } else if (choice == 2) {
            System.out.print("Shkruani gjatësinë e drejtkëndëshit: ");
            double gjatesia = input.nextDouble();
            System.out.print("Shkruani gjeresinë e drejtkëndëshit: ");
            double gjeresia = input.nextDouble();
            FiguraGjeometrike figura = new Drejtkendeshi(gjatesia, gjeresia);
            printoTeDhenat(figura);
        } else if (choice == 3) {
            System.out.println("Zgjidhni llojin e trekëndëshit:");
            System.out.println("0 - DyBrinjeNjeshem");
            System.out.println("1 - KendDrejte");
            System.out.println("2 - KendDrejte dhe DybrinjeNjeshem");
            int lloji = input.nextInt();
            System.out.print("Shkruani brinjën A: ");
            double brinjaA = input.nextDouble();
            System.out.print("Shkruani brinjën B: ");
            double brinjaB = input.nextDouble();
            System.out.print("Shkruani brinjën C: ");
            double brinjaC = input.nextDouble();
            FiguraGjeometrike figura = new Trekendeshi(brinjaA, brinjaB, brinjaC, lloji);
            printoTeDhenat(figura);
        } else if (choice == 4) {
            System.out.print("Shkruani rrezen e rrethit: ");
            double rreze = input.nextDouble();
            FiguraGjeometrike figura = new Rrethi(rreze);
            printoTeDhenat(figura);
        } else {
            System.out.println("Zgjedhje e gabuar!");
        }

        input.close();
    }

    public static void printoTeDhenat(FiguraGjeometrike figura) {
        System.out.println("\nTe dhenat e figures gjeometrike:");
        System.out.println("Perimetri: " + figura.llogaritPerimetrin());
        System.out.println("Siperfaqja: " + figura.llogaritSiperfaqen());
    }
}