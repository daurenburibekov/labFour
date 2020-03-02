package kz.iitu.labtwo;

import java.util.HashMap;

public class Member {
    private String name;
    private String email;
    private Client membership;
    private HashMap<Thing, Double> orders = new HashMap<Thing, Double>();

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.membership = new Customer();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Client getMembership() {
        return membership;
    }
    public void setMembership(Client membership) {
        this.membership = membership;
    }

    public String getRate() {
        return membership.getRate();
    }
    public double getDiscount() {
        return membership.getDiscount();
    }

    public void addToOrder(Thing thing, double price){
        orders.put(thing, price);
    }
    public void getOrders(){
        orders.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", membership=" + membership +
                ", orders=" + orders +
                '}';
    }
}
