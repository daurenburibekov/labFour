package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface Client {

    String getRate();
    double getDiscount();

}
