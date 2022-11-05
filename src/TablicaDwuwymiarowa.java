import java.util.Random;

public class TablicaDwuwymiarowa {
    static int[][] utworzTablice()
    {
        int rozmiarTablicy;
        Random a = new Random();
        Random b = new Random();
        Random c = new Random();
        int wartosc;
        wartosc= c.nextInt(21)-20;
        int zakres;
        if(b.nextInt(2)-1==0){zakres=1;}
        else
        {
            zakres=-1;
        }
        rozmiarTablicy=a.nextInt(10)+10;
        int [][] tablica = new int [rozmiarTablicy][rozmiarTablicy];
        //Tworzenie kwadratowej tablicy dwuwymiarowej o lowsowej wielkosci z zakresu [10-20]
        //Elementy na przekatnej maja losowa wartosc -1 lub 1
        //Pozostale elementy maja losowa wartosc z zakresu [-20,20]
        for(int i=0;i<rozmiarTablicy;i++)
        {
            for(int j=0;j<rozmiarTablicy;j++)
            {
                if(j==i)
                {
                    tablica[i][j]=zakres;

                }
                else
                {
                    tablica[i][j]=wartosc;
                }
            }
        }

        for(int i=0;i<rozmiarTablicy;i++)
        {
            for(int j=0;j<rozmiarTablicy;j++)
            {
                System.out.print(tablica[i][j]+ " ");
            }
            System.out.println("");

        }

    return tablica;
    }
    static void stosunekSum(int [][] tablica)
    {
        int sumaPWierszy=0;
        int sumaNKolumy=0;
        for(int i=0;i<tablica.length;i++)
        {
            for(int j=0;j<tablica[i].length;j++)
            {
                if(i%2==0)
                {
                    sumaPWierszy+=tablica[i][j];
                }
                if(j%2==1)
                {
                    sumaNKolumy+=tablica[i][j];
                }
            }
        }
        double stosunek;
        stosunek = (double)sumaPWierszy/sumaNKolumy;
        System.out.println("Stosunek sumy liczb w komorkach o parzystych wierszach do sumy liczb w komorkach o nieparzystych kolumnach wynosi: " + stosunek);
        //Random x = new Random();


    }
}
