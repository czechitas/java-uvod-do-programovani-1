package cz.czechitas.promenne;

import net.sevecek.console.*;

public class SpousteciTrida {

    public static void main(String[] args) {

        /*
        System.out.println("Ahoj pozemstani, zavedte me ke svemu veliteli");

        System.out.println("Tohle je dalsi text");

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);

        System.out.println(2.5 * 6.0);
        // Toto je moje poznamka
        System.out.println(9.0 / 2.0);

        System.out.println("Kamil" + " " + "Ševeček");
        System.out.println(1 + 2 + "Kamil" + " ");

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.cos( 3.1415 ) );

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

        String mesto;
        TextConsole.setInputCharset("UTF-8");

        System.out.print("Zadejte svoje město (bydliště):");
        mesto = TextConsole.readLine();
        System.out.println("Zadali jste: " + mesto);

        int rokNarozeni;
        System.out.print("Zadejte rok narozeni: ");
        rokNarozeni = TextConsole.readInt();

        double vyskaUzivatele;
        System.out.print("Zadejte svoji výšku: ");
        vyskaUzivatele = TextConsole.readDouble();

        double hmotnostUzivatele;
        System.out.print("Zadejte svoji hmotnost: ");
        hmotnostUzivatele = TextConsole.readDouble();

        double bmi;
        bmi = hmotnostUzivatele /
                ((vyskaUzivatele/100.0) *
                (vyskaUzivatele/100.0));
        System.out.println("Vase BMI je " + bmi);
        */

        double nahodneCislo;
        nahodneCislo = Math.random() * 6.0 + 1.0;
        System.out.println(nahodneCislo);

        int hozenoNaKostce;
        hozenoNaKostce = (int) nahodneCislo;
        System.out.println(hozenoNaKostce);

    }

}
