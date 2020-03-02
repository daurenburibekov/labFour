package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class Shop {
    private ArrayList<Thing> things;
    private HashMap<Member, Double> order = new HashMap<Member, Double>();

    public ArrayList<Thing> getThings() {
        return things;
    }
    public void setThings(List things) {
        this.things = (ArrayList<Thing>) things;
    }

    public void buy(Member member, Thing thing){
        if(!order.containsKey(member)){
            order.put(member, 0.0);
        }
        order.put(member, order.get(member)+(thing.getPrice()*(member.getDiscount()/100)));
        member.addToOrder(thing, (thing.getPrice()*(member.getDiscount()/100)));
        System.out.println(member.getName() + " купил " + thing.getName() + " за " + (thing.getPrice()*(member.getDiscount()/100)) +
                ", потому что он " + member.getRate() + " клиент, и у него " + member.getDiscount() +" % скидка.");
    }
}
