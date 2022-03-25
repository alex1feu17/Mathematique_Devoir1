package com;

import java.util.ArrayList;

public class Calculator {
    // Algorithme d'Euclide
    public int Calculer_plus_grand_diviseur(int nb1, int nb2)
    {
        int result = 0;
        while(nb2 != 0)// on verifie chaque nombre jusqu'a arriver à 0 et sortir de la boucle
        {
            result = nb1 % nb2; // encapsuler le resultat du modulo des deux nombres
            nb1 = nb2; // Le diviseur est maintenant dans la variable nb1
            nb2 = result;
        }
        return nb1; // on retourne la valeur nb1
    }

    // Definition 8
    public int Calculer_plus_petit_commun_multiple(int nb1, int nb2)
    {
        int divisor, modulo, result;

        divisor = nb1 * nb2; // Le divisor encapsule la multiplication des deux nombres
        modulo = nb1 % nb2; // Le modulo encapsule le modulo du nb2
        while(modulo != 0){ // On va essayer de faire un modulo de chaque nombre jusqu'a ce que la valeur donne 0. Ensuite on sort de la boucle.
            nb1 = nb2;
            nb2 = modulo; // On entre la réponse dans le nb2
            modulo = nb1 % nb2; // modulo va prendre la nouvelle valeur du modulo de nb2
        }
        result = divisor / nb2; // result va encapsuler le resultat de la division entre le divisor et nb2
        return result;
    }
}
