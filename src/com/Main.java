// Alexy Duval Gabriel Deschenes
package com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Saisir le premier nombre : ");
        String number1 = myObj.nextLine();
        int nb1 = Integer.parseInt(number1);

        System.out.println("Saisir le deuxième nombre : ");
        String number2 = myObj.nextLine();
        int nb2 = Integer.parseInt(number2);

        System.out.println("Le plus grand commun diviseur de "+ nb1 +" et "+ nb2 +" est : " +calculator.Calculer_plus_grand_diviseur(nb1,nb2));
        System.out.println("Le plus petit commun multiple de "+ nb1 +" et "+ nb2 +" est : "+ calculator.Calculer_plus_petit_commun_multiple(nb1,nb2));

    }
}

