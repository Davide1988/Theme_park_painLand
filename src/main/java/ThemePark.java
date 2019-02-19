import attraction.Attraction;
import stall.Stall;
import umans.Visitor;

import java.util.ArrayList;

public class ThemePark {


    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int getAttractioncount(){
        return this.attractions.size();
    }



    public String visit(Attraction attraction, Visitor visitor){
        return visitor.getName() + " is on " + attraction.getName();
    }






}
