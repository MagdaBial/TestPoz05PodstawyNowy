import javafx.util.Pair;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static String zwrocImie (Integer case1) {
      //  Integer case1 = 5;
        String imie = "";
        switch (case1) {
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
        }
        return imie;
    }

    public static Double cenaBrutto(Double cena) {
        return cena*1.23;
    }

    public static void przedstawSie (String imie) {
        System.out.println("Moje imie to "+ imie);
    }
    //Wpisujemy main
    //Funkcja egzekucyjna
    public static void main(String[] args) {
        String imie = zwrocImie(5);
        przedstawSie(imie);
        imie = zwrocImie(1);
        przedstawSie(imie);
        przedstawSie(zwrocImie(10));




        System.out.println("Hej, mój pierwszy program");
        //zmienne
        // definicja typu (String), nazwa zmiennej (napis1) + opcjonalnie przydzielenie wartosci
        String napis1 = "Katarzyna Nowakowska";
        // Boolean - typ logiczny, zwraca true lub false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.println(isTomek);
        //Integer - typ numeryczny liczb calkowitych, Integer to klasa wrapujaca typ prsty ins (daje metody ulatwiajace prece z danym typem)
        Integer liczba1 = 2;
        // Long - liczba całkowita, ale duzo dluzsza
        Long liczba2 = Long.valueOf(1302);
        liczba1.equals(liczba2);
        //Float - typ numeryczny zmiennoprzecinkowy
        double ulamek1 = 10.55;
        //Double - zmiennoprzecinkowa, inny zakres, większy zakres
        Double ulamek2 = 10.5;

        // kolekcje
        //Lista = zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());

        //HashMap - slownik trzymający pary klucz-wartość
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        System.out.println(mapa1.toString());
        //Pair - slownik tylko jedna para klucz wartosc
        Pair<String, Integer> mojaPara = new Pair<>("Kasia", 1);
        String napis2 = mojaPara.getKey();
        napis2 += mojaPara.getValue().toString();
        System.out.println(napis2);

        //Pętle
        //Pętla for
        //Warunek początkowy; warunek końcowy; modyfikator licznika
        //warunek końcowy (wartość końcowa licznika;
        //modyfikator licznika i++ oznacza, że i będzie większe o 1 po przejściu pętli
        for (Integer i = 0; i < 5; i++) {
            System.out.println("Wartosc licznika:" + i.toString());
        }

        Integer i = 0;
        while (i < 5) {
            System.out.println("Jestem w while po raz" + i.toString());
            i++;
        }

        //Break to specjalne slowo, które pozwala zakończyć działanie petli
        //Continue pozwala przejść do kolejnej interakcji z pominięciem kodu pod tym słówkiem
        while (true) {
            i++;
            if (i.equals(7))
                continue;
            System.out.print(" " +i.toString());
            if (i.equals(10))
                break;

        }

        //Petla do while - zawsze wykona się chociaż jedna interakcja
        do {
            System.out.println("Jestem w do while" + i.toString());
            i++;
        }while(i<10);

        //Petla for each na liscie
        for (String el: lista1) {
            System.out.println("Element listy: " + el);
        }

        //Petla for each na mapie #TODO
        //for(String el: mapa1)()

        //Instrukcje warunkowe
        //Instrukcje if..else if... else
        if (lista1.size() ==2){
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }
        if (lista1.size()<1){
            System.out.println("Z tym warunkiem nigdy się nie wypisze");
        }else{
            System.out.println("Jestem w instrukcji else");
        }

        if (lista1.size()<1) {
            System.out.println("Nie wykonam sie");
        }else if(lista1.size() ==2){
            System.out.println("Ja się wykonam");
        }else{
            System.out.println("Ja się już nie wykonam, bo warunek jest spelniony");
        }

        //Instrukcja warunkowa switch case, na koncu każdego swich case powinno się znaleźć słówko break

        i=2;
        String message = "Moje imie to";
        switch (i) {
            case 2: message += "Kasia"; break;
            case 5: message += "Tomek"; break;
            case 8: message += "Dawid"; break;
        }

        System.out.println(message);

        HashMap<String, Double> owoce = new HashMap<>();
        owoce.put("jablko", 2.5);
        owoce.put("banan", 4.8);
        owoce.put("gruszka", 6.29);
        List <String> nazwyOwocow = new ArrayList<>();
        nazwyOwocow.add("jablko");
        nazwyOwocow.add("banan");
        nazwyOwocow.add("gruszka");

        Double cenaSumaryczna = 0.0;
        for( i =0; i<owoce.size(); i++) {
            String owoc = nazwyOwocow.get(i);
            cenaSumaryczna += cenaBrutto(owoce.get(owoc));
            System.out.println(owoc);
            System.out.println(cenaBrutto(owoce.get(owoc)));
        }
        System.out.println("Cena Twoich zakupów to: " +cenaSumaryczna.toString());
    }
}
