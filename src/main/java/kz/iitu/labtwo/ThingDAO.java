package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

@Component
public class ThingDAO {
    public void createThing(Service service){
        System.out.println("ThingDAO.createThing");
    }
    public void createThing(Product product){
        System.out.println("ThingDAO.createThing");    }
}
