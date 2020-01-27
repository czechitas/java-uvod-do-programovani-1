package cz.czechitas.promenne;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        int volba;
        System.out.println("Nemate-li dost penez, zadejte 1, jinak 0.");
        volba = console.nextInt();
        while (volba == 1) {
            System.out.println("Osliku, otres se. Cink, cink, cink.");
            System.out.println();
            System.out.println("Nemate-li dost penez, zadejte 1, jinak 0.");
            volba = console.nextInt();
        }

        /*
        int hozenoNaKostce;
        hozenoNaKostce = (int) (Math.random() * 6 + 1);
        System.out.println("Hodil jsem " + hozenoNaKostce);
        while (hozenoNaKostce != 6) {
            hozenoNaKostce = (int) (Math.random() * 6 + 1);
            System.out.println("Hodil jsem " + hozenoNaKostce);
        }
        */

        */

        /*
        for (int i=0; i<3; i++) {
            System.out.println("Kralik");
        }
        */

        /*
        for (int i=0; i<4; i++) {
            System.out.println("Tucnak");
            for (int j=0; j<2; j++) {
                System.out.println("Opice");
            }
        }
        */

        System.out.println("Zadejte svuj vek: ");
        int vek;
        vek = console.nextInt();
        if (vek >= 18) {
            System.out.println("Zde je vase pinacolada.");
        } else {
            System.out.println("Pro vas jen limonada.");
        }

    }

}
