package stall;

import umans.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}
