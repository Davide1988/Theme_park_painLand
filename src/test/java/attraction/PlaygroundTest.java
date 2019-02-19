package attraction;

import org.junit.Before;
import org.junit.Test;
import umans.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor;
    private Visitor visitor1;


    @Before
    public void before(){
        playground = new Playground("Funnyland",3);
        visitor = new Visitor("Bob", 30, 175, 29);
        visitor1 = new Visitor("Sandy", 5, 175, 29);
    }



    @Test
    public void isAllowedWorks(){
        assertEquals(false, playground.isAllowedTo(visitor));
        assertEquals(true, playground.isAllowedTo(visitor1));
    }


}
