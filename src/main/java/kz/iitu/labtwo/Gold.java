package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

@Component
public class Gold implements Client {
    private double discount = 85;

    @Override
    public String getRate() {
        return "Gold";
    }

    @Override
    public double getDiscount() {
        return (discount);
    }
}
