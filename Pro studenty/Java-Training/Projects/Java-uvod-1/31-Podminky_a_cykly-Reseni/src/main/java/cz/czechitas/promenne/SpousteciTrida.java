package cz.czechitas.promenne;

import net.sevecek.console.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        TextConsole.setInputCharset("UTF-8");

        for (int kedlubna=0; kedlubna<10; kedlubna++) {
            System.out.println("Králík");
            for (int mrkev=0; mrkev<3; mrkev++) {
                System.out.println("Husa");
            }
        }

        /*
        System.out.println("Osel");

        for (int i = 0; i < 7; i++) {
            System.out.println((i+1) + ". Králík");
        }
        */


        int praniUzivatele;
        praniUzivatele = TextConsole.readInt();
        while (praniUzivatele == 1) {
            System.out.println("Osel");
            praniUzivatele = TextConsole.readInt();
        }

        double nahodneCislo;
        nahodneCislo = Math.random();
        System.out.println("Vygenerovali jsme " + nahodneCislo);
        if (nahodneCislo > 0.5) {
            System.out.println("Super");
        }
    }

}
