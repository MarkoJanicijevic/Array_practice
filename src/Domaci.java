package Domaci;

import java.util.Scanner;





public class Domaci {
    public static void main(String[] args) {
        int [] neki_niz = unos_niza();
        stampanje_niza(neki_niz);
        System.out.println(srednja_vrednost(neki_niz));
        System.out.println(sabiranje_dvocifrenih(neki_niz));
        System.out.println(razlika_min_max(neki_niz));

    }
    public static int[] unos_niza () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina_niza = sc.nextInt();

        int [] niz = new int[duzina_niza];

        for (int i = 0; i < duzina_niza; i++){
            System.out.println("Unesite sledeci broj za niz: ");
            niz[i] = sc.nextInt();
        }
        return niz;

    }
    public static void stampanje_niza (int [] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static int srednja_vrednost (int [] x) {
        int srednja_vrednost = 0;
        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        srednja_vrednost = suma / x.length;
        return srednja_vrednost;
    }
    public static int sabiranje_dvocifrenih (int [] x) {
        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 100 && x[i] > 9){
                suma += x[i];
            }
        }
        return suma;

    }
    public static int razlika_min_max (int [] x) {
        int razlika = 0;
        int min = x[0];
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
            if (x[i] > max) {
                max = x[i];
            }

        }
        razlika = max - min;
        return razlika;
    }
}
