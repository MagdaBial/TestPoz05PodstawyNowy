import javax.xml.namespace.QName;

public class Obiektowość {
    public static void main(String[] args) {

        Human czlowiek1 = new Human("Kasia", "Nowakowska", 1991);
        //Metoda PrzedstawSię jest dostępna, bo jest public
        czlowiek1.przedstawSie();

        //Atrybut name oraz funkcja oblicz wiek nie są dostępne poza klasą Human
        //bo są prywatne
        //czlowiek1.name;
        //czlowiek1.obliczWiek ();

        Human czlowiek2 = new Human("Robert", "Kowalski", 1959);
        czlowiek2.przedstawSie();

        Human czlowiek3 = new Human("Gosia", "Majewska", 1958);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + " " + czlowiek3.getSurname());
        czlowiek3.setBirthYear(1975);
        czlowiek3.przedstawSie();

        //2 Obiekty klasy Car
        Car opel = new Car("astra", "opel", 2016);
        opel.przyspiesz( 60);
        opel.OpiszAuto();

        Car bmw = new Car( "m3", "bmw", 2015);
        bmw.przyspiesz(152);
        bmw.OpiszAuto();
    }
}
