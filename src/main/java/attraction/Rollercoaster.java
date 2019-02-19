package attraction;

import stall.ISecurity;
import umans.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12){
            return true;
        }else {
            return false;
        }
    }

}
