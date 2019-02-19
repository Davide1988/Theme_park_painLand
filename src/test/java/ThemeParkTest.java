import attraction.Attraction;
import attraction.Rollercoaster;
import attraction.RollercoasterTest;
import org.junit.Before;
import org.junit.Test;
import stall.IceCreamStall;
import stall.Stall;
import umans.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark;
    private Rollercoaster rollercoaster;
    private Visitor visitor;
    private Visitor visitor2;
    private Stall stall;

    @Before
    public void before(){

        themepark = new ThemePark("PainLand");
        rollercoaster = new Rollercoaster("Rollievomit", 3);
        stall = new IceCreamStall("Icylife", "Algida", 100, 2);
        visitor = new Visitor("Bob", 30, 201, 29);
        visitor2 = new Visitor("Igne", 30, 100, 100);


        themepark.addAttraction(rollercoaster);
        themepark.addStall(stall);

    }

    @Test
    public void canAddAttraction(){
        assertEquals(1, themepark.getAttractionsCount());
    }

    @Test
    public void canAddStall(){
        assertEquals(1, themepark.getStallCount());
    }

    @Test
    public void clientCanVisitAttraction(){
        themepark.visit(rollercoaster, visitor);
        assertEquals(20.60, visitor.getMoney(),0.01);
    }




}
