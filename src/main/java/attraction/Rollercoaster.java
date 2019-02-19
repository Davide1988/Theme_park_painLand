package attraction;

import stall.ISecurity;
import umans.Visitor;

public class Rollercoaster extends Attraction implements ISecurity,ITicketed {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 200) {
            return defaultPrice() * 2;
        }
            return defaultPrice();
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
