package abstraction.inter;

public class main {

    public static void main(String[] args){
        Hyundai car = new Hyundai();
        car.typeOfBrake();
        car.colorOfBody();

        Brakes brake = new Hyundai();
        System.out.println(brake.typeOfBrake());
        Youtuber dileep = new Youtuber(new Hyundai());
        Youtuber sonal = new Youtuber(new Mercedes());
    }
}
