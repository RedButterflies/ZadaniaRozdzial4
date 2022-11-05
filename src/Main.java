import java.util.Random;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int[] tablica;
        tablica = TablicaJednowymiarowa.wypelnionaTablica();
        for (int i = 0; i < 100; i++) {
            System.out.println(tablica[i]);
        }
        TablicaJednowymiarowa.wyswietlWKwadracie(tablica);
        System.out.println("");
        TablicaDwuwymiarowa.utworzTablice();
        Random x = new Random();
        int zakres = x.nextInt(11);

        int[][] tablica2 = new int[3][5];
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++) {
                tablica2[i][j] = i + j;
            }
        }
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++) {
                System.out.print(tablica2[i][j] + " ");
            }
            System.out.println();
        }
        TablicaDwuwymiarowa.stosunekSum(tablica2);

        KlasaOkrag [] tablicaOkregow;
        tablicaOkregow=KlasaOkrag.utworzTabliceOkregow(6);
        KlasaOkrag.wyswietlObiekt(tablicaOkregow);
        KlasaOkrag okrag1= tablicaOkregow[0];
        for(int i=1;i<tablicaOkregow.length;i++)
        {
            KlasaOkrag.wzajemnePolozenieOkregow(okrag1,tablicaOkregow[i]);
            okrag1=tablicaOkregow[i];
        }


    }

}




