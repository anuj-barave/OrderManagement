package com.orderManagement.orderApi.Food;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FoodCommandLineRunner implements CommandLineRunner {

    @Autowired
    FoodRepository foodRepository;

    @Override
    public void run(String... args) throws Exception {
            foodRepository.save(new Food("Vadapav",12.00));
    }

}
