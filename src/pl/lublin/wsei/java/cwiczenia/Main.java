package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;


import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.print("Ala");// wypisuje tekst na konsoli i nie przechodzi do następnej lini
        System.out.print("ma");
        System.out.print("kota");

        System.out.print("\n\n");

        System.out.print("Ala\n");// wypisuje tekst na konsoli i przechodzi do następnej lini za pomocą \n
        System.out.print("ma\n");
        System.out.print("kota\n");

        System.out.print("\n\n"); // \n przechodzi do następnej lini"

        System.out.println("Ala");// wypisuje tekst na konsoli i przechodzi do następnej lini
        System.out.println("ma");
        System.out.println("kota");

        System.out.print("\n\n");

        System.out.printf("Ala");// wypisuje tekst na konsoli i nie przechodzi do następnej lini
        System.out.printf("ma");
        System.out.printf("kota");



        int a =3;
        double b=4.21;
        String s = "Jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);


        System.out.printf("Nazywaliśmy to \"witaminą B3\"");

        System.out.printf("alfa/tsin(alfa)\n");
        for(int i=0;i<370;i+=10)
        {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }
        */

        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {

        System.out.print("Podaj pierwszą liczbę: ");
        num1 = input.nextInt();
        if(num1 == 0) break;
            System.out.print("Podaj drugą liczbę: ");
            num2 = input.nextInt();
            if(num1 == 0) break;
        System.out.printf("Wynik dodawania %d + %d = %d%n ",num1,num2,num1+num2);
        }while(true);




    }
}
