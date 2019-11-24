package dziedzicienie;

import obiektowosc.Human;

public class Woman extends Human {

    private String plec;

    public Woman (String name, String surname, Integer birthYear){
        super(name, surname, birthYear);
        this.plec = "Kobieta";
    }

    //Nadpisywanie metod
    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println("Jestem " + this.plec);
    }
}
