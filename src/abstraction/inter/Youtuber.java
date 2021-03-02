package abstraction.inter;

public class Youtuber {

    private Brakes brakes;
    public Youtuber(Brakes brakes){
        this.brakes = brakes;
    }

    public void printTypeOfBrakes(){
        System.out.println(" Here is my review"+brakes.typeOfBrake());
    }
}
