package kz.iitu.labtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Silver implements Client {
    private double discount = 90;

    @Override
    public String getRate() {
        return "Premium";
    }

    @Override
    public double getDiscount() {
        return (discount);
    }
}
