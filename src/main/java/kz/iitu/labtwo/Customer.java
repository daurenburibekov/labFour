package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

@Component
public class Customer implements Client {

    private double discount = 100;

    @Override
    public String getRate() {
        return "Customer";
    }

    @Override
    public double getDiscount() {
        return (discount);
    }
}
