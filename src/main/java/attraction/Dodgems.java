package attraction;

import umans.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name) {
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


}
