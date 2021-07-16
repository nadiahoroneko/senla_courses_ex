package ex7;

import java.util.ArrayList;
import java.util.List;

public class SafeCell {
    private List<Thing> things = new ArrayList<>();

    public SafeCell(List<Thing> cell) {
        this.things.addAll(cell);
    }

    public SafeCell() {
    }

    public List<Thing> getThings() {
        return things;
    }

    public void addThing(Thing thing){
        things.add(thing);
    }

    public int getSumPrice(){
        int sum = 0;
        for(Thing thing:things){
            sum+=thing.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        String str = "In safe:\n";
        for(Thing t : things){
            str+="\t-"+t+"\n";
        }
        str+="Total price: "+getSumPrice();
        return str;
    }
}
