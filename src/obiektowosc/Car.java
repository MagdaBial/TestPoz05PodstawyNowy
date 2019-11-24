package obiektowosc;

public class Car {

    //Atrybuty klasy
    private String model;
    private String marka;
    private Integer RokProdukcji;
    private Integer age;
    private Integer predkosc;

    //Konstruktor
    public Car(String model, String marka, Integer RokProdukcji) {
        this.model = model;
        this.marka = marka;
        this.RokProdukcji = RokProdukcji;
        this.age = this.obliczWiek();
        this.predkosc = 0;
    }

    private Integer obliczWiek() {
        Integer actualYear = 2019;
        return actualYear - this.RokProdukcji;
    }

    public void przyspiesz(Integer zmiana){
        this.predkosc += predkosc;
        System.out.println("Twoja aktualna predkosc to " + this.predkosc);
        return this.predkosc;
    }

    public void OpiszAuto(){
        System.out.println("Oto "+ this.model + " " + this.marka);

        if (this.age < 5) {
            System.out.println("Nowe auto prawie nie używane");
        }else if(this.age <= 20) {
            System.out.println("Troche już jeździ, ale jeszcze działa");
        }else (
            System.out.println("Nadaje się tylko na złom")
    }
}


