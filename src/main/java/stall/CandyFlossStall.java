package stall;

import umans.Visitor;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}
