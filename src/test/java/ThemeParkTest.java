import attraction.Attraction;
import attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import umans.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark;
    private Attraction attraction;
    private Visitor visitor;

    @Before
    public void before(){

        themepark = new ThemePark("PainLand");
        attraction = new Rollercoaster("Rollievomit");
        visitor = new Visitor("Bob", 30, 175, 29);


        themepark.addAttraction(attraction);

    }

    @Test
    public void canAddAttraction(){
        assertEquals(1, themepark.getAttractioncount());
    }

    @Test
    public void clientCanVisitAttraction(){
        assertEquals("Bob is on Rollievomit", themepark.visit(attraction, visitor));
    }



}
