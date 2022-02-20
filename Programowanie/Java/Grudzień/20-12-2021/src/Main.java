import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        Pętla for

        for(początek;koniec;licznik) {
            //ciało pętli
        }

        Pętla foreach - to konstrukcja, która pozwala Nam na sekwencyjne przeglądanie różnych zbiorów danych.
        Takie jak tablica lub kolekcja.

        for(Typ_obiektu nazwa_obiektu : nazwa_tablicy) {
            //ciało pętli
        }

        for(Typ_obiektu nazwa_obiektu : nazwa_kolekcji) {
            //ciało pętli
        }

         */

        char[] tablica = new char[]{'a','b','c'};

        for (char x : tablica)
            System.out.print(x + " ");


    }
}

