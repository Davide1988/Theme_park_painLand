package stall;

import umans.Visitor;

public class TabaccoStall extends Stall implements ISecurity{

    public TabaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }else{
            return false;
        }
    }



}
