package attraction;

import stall.ISecurity;
import umans.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }




    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
            return true;
        } else {
            return false;
        }
    }


}
