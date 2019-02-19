package attraction;

import umans.Visitor;

public interface ITicketed {

    double defaultPrice();


    double priceFor(Visitor visitor);


}
