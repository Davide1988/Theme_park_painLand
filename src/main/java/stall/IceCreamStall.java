package stall;

import umans.Visitor;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }


}
