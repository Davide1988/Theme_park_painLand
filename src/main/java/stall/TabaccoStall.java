package stall;

import umans.Visitor;

public class TabaccoStall extends Stall implements ISecurity{

    public TabaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }else{
            return false;
        }
    }


    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}
