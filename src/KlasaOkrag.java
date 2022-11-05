import java.util.Random;

import static java.lang.Math.sqrt;

public class KlasaOkrag {
    double x;
    double y;
    double r;


    Random random = new Random();
    Random promien = new Random();

    public KlasaOkrag() {
        this.x = random.nextInt(91)+5;
        this.y = random.nextInt(91)+5;
        this.r = promien.nextInt(5)+1;
    }
    static KlasaOkrag [] utworzTabliceOkregow(int rozmiar)
    {
        KlasaOkrag [] tablicaOkregow = new KlasaOkrag[rozmiar];
        for(int i=0;i<tablicaOkregow.length;i++)
        {
            tablicaOkregow[i]=new KlasaOkrag();
        }

        return tablicaOkregow;
    }
    static void wzajemnePolozenieOkregow(KlasaOkrag a, KlasaOkrag b)
    {
        double odlegloscOkregow = sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
        System.out.println("Odleglosc okregow: "+ odlegloscOkregow);
        if(odlegloscOkregow==a.r+b.r)
        {
            System.out.println("Okregi sa styczne zewnetrznie");
        }
        else if(odlegloscOkregow>a.r+b.r)
        {
            System.out.println("Okregi sa rozlaczne");
        }
        else if(odlegloscOkregow<a.r+b.r && odlegloscOkregow>(a.r-b.r))
        {
            System.out.println("Okregi przecinaja sie");
        }
        else if(odlegloscOkregow==a.r-b.r)
        {
            System.out.println("Okregi sa styczne wewnetrznie");
        }
        else if(odlegloscOkregow<(a.r-b.r))
        {
            System.out.println("Okregi nie sa styczne i wiekszy zawiera mniejszy");
        }
    }
    static void wyswietlObiekt(KlasaOkrag [] okrag)
    {
        int i=0;
        for(KlasaOkrag a : okrag)
        {
            i++;
            System.out.println("Okrag "+ i + " X  "+ a.x +" Y " + a.y + " Promien "+ a.r);
        }
    }


}
