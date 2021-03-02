package abstraction.inter;

public class Hyundai implements Brakes, Body {
    @Override
    public String typeOfBrake() {
        return "ABS";
    }

    @Override
    public String colorOfBody() {
        return "White";
    }
}
