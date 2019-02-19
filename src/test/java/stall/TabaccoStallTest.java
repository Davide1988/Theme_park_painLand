package stall;


import org.junit.Before;
import org.junit.Test;
import umans.Visitor;

import static org.junit.Assert.assertEquals;

public class TabaccoStallTest {

    private TabaccoStall tabaccoStall;
    private Visitor visitor;
    private Visitor visitor1;


    @Before
    public void before(){

        tabaccoStall = new TabaccoStall("Smoky","Someone",2);

        visitor = new Visitor("Bob", 30, 175, 29);
        visitor1 = new Visitor("Sandy", 5, 175, 29);
    }

    @Test
    public void isAllowedWorks(){
        assertEquals(true, tabaccoStall.isAllowedTo(visitor));
        assertEquals(false, tabaccoStall.isAllowedTo(visitor1));
    }


}
