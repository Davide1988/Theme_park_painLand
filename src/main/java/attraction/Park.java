package attraction;

import umans.Visitor;

public class Park extends Attraction {

    public Park(String name) {
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
