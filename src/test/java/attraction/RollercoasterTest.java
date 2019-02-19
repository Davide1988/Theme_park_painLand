package attraction;

import org.junit.Before;
import org.junit.Test;
import umans.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor;
    private Visitor visitor1;
    private Visitor visitor2;



    @Before
    public void before(){

        rollercoaster = new Rollercoaster("RollyPolly",3);
        visitor = new Visitor("Bob", 30, 201, 29);
        visitor1 = new Visitor("Sandy", 5, 175, 29);
        visitor2 = new Visitor("Freddy", 30, 100, 29);


    }

    @Test
    public void isAllowedWorks(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void shouldPayDoubleForTallFella(){
        rollercoaster.charge(visitor);
        assertEquals(12.20, visitor.getMoney(),0.01);
    }


}
