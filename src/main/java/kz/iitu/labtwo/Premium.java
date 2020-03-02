package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

@Component
public class Premium implements Client {

    private double discount = 80;

    @Override
    public String getRate() {
        return "Premium";
    }

    @Override
    public double getDiscount() {
        return (discount);
    }
}
