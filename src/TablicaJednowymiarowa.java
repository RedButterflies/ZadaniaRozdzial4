import static java.lang.Math.round;

public class TablicaJednowymiarowa {

    static int [] wypelnionaTablica()
    {
        int [] tablica = new int [100];
        for(int i=0;i<100;i++)
        {
            tablica[i]=i;
        }
        return tablica;
    }
    static void wyswietlWKwadracie(int [] tablica)
    {
        int j=0;
        double [] srednieWTablicy = new double [10];

        //Obliczanie sredniej w kolumnie
        for(int o=0;o<10;o++)
        {
            for(int i=o;i<tablica.length;i+=10) {
                srednieWTablicy[o] += ((double)(tablica[i])/10);
            }
        }

        //Drukowanie w kwadracie
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]<10) {
                System.out.print(0);
            }
            System.out.print(tablica[i]+", ");
            j++;
            if(j==10) {
                System.out.println("");
                j=0;
            }

        }
        //Drukowanie sredniej obliczonej z kolejnych kolumn pod tymi kolumnami
        System.out.println("Srednia w kazdej kolumnie");
        for(int i=0;i<10;i++)
        {
            System.out.print(round(srednieWTablicy[i])+ ", ");
        }

    }
}
