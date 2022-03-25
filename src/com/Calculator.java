package com;

import java.util.ArrayList;

public class Calculator {
    // Algorithme d'Euclide
    public int Calculer_plus_grand_diviseur(int nb1, int nb2)
    {
        int r=0;
        while(nb2!=0)
        {
            r=nb1%nb2;
            nb1=nb2;
            nb2=r;
        }
        return nb1;
    }
    
    /*public int Calculer_plus_petit_commun_multiple(int nb1, int nb2)
    {
        arraysNb1[i] = nb1;
        arraysNb2[i] = nb2;

        while(divisor != 0)
        {
            arraysNb1[i+1] =  nb1 * nb1;
            arraysNb2[i+1] =  nb2 * nb2;

            for(int y = 1; y <= arraysNb1.length; y++)
            {
                for(int x = 1; x <= arraysNb2.length; x++)
                {
                    if(arraysNb1[y] == arraysNb2[x])
                    {
                        divisor = arraysNb1[y];
                    }
                }
            }
            i++;
        }
        return divisor;
    }*/
}
