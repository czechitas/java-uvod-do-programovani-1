package cz.czechitas.promenne;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        System.out.println("Ahoj pozemstani, zavedte me ke svemu veliteli");

        System.out.print("Ahoj");
        System.out.print(" ");
        System.out.print("zdravi Kamil");
        System.out.println();

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);

        System.out.println(2.5 * 6.0);
        System.out.println(9.0 / 2.0);

        System.out.println(6 + 10 * 5);
        System.out.println("7 + 5");

        System.out.println("Kamil" + " " + "Ševeček");
        System.out.println(1 + 2 + "Kamil" + " ");

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.cos( 3.14159265359 ) );
        System.out.println( Math.cos( Math.PI / 2 ) );
        */
        /*
        int vek;
        vek = 36;
        //vek = "XXXX";
        System.out.println(vek);
        vek = vek + 1;
        System.out.println(vek + 2);
        System.out.println(vek);

        String krestniJmeno;
        String prijmeni;
        krestniJmeno = "Kamil";
        prijmeni = "Ševeček";
        System.out.println(krestniJmeno + " " + prijmeni);
        */

        /*
        String mesto;
        System.out.print("Zadejte svoje město (bydliště):");
        mesto = console.nextLine();
        System.out.println("Zadali jste: " + mesto);

        int rokNarozeni;
        System.out.print("Zadejte rok narozeni: ");
        rokNarozeni = console.nextInt();
        System.out.println("Nacetl jsem " + rokNarozeni);
        */

        /*
        double vyska;
        double hmotnost;
        System.out.println("Vlozte svoji vysku v metrech: ");
        vyska = console.nextDouble();
        System.out.println("Vlozte svoji hmotnost v kg: ");
        hmotnost = console.nextDouble();

        double bmi;
        bmi = hmotnost / (vyska * vyska);
        System.out.print("Vase BMI je: ");
        System.out.println(bmi);
        */

        double nahodneCislo;
        nahodneCislo = Math.random() * 6.0 + 1.0;
        System.out.println(nahodneCislo);

        int hozenoNaKostce;
        hozenoNaKostce = (int) nahodneCislo;
        System.out.println(hozenoNaKostce);

    }

}
