package com.orderManagement.orderApi.Repository;

import com.orderManagement.orderApi.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {

    Food findByName(String item);
}
