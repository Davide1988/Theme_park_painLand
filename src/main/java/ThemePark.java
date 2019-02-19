import attraction.Attraction;
import attraction.Rollercoaster;
import forall.IReviewed;
import stall.ISecurity;
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

    public int getAttractionsCount(){
        return this.attractions.size();
    }

    public int getStallCount(){
        return this.stalls.size();
    }


    public ArrayList<IReviewed> getAllReview(){
        ArrayList review = new ArrayList();
        return review;
        
    }


//    public void visit(Rollercoaster rollercoaster, Visitor visitor){
//        if (rollercoaster.isAllowedTo(visitor) == false ){
//            return;
//        }else{
//            visitor.payForRide(rollercoaster.defaultPrice());
//
//        }
//    }






}
