package com.orderManagement.orderApi.ServiceImpl;

import com.orderManagement.orderApi.Entity.Food;
import com.orderManagement.orderApi.Repository.FoodRepository;
import com.orderManagement.orderApi.Service.FoodService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodRepository foodRepository;

    @Override
    public List<Food> getAllFoodItem() {
        return foodRepository.findAll();
    }

    @Override
    public Food getFoodItemById(int FoodId) {
        return foodRepository.findById(FoodId).orElse(null);
    }

    @Override
    public Food getFoodItemByName(String FoodName) {
        return foodRepository.findByName(FoodName);
    }

    @Override
    public void addFoodItem(Food food) {
        foodRepository.save(food);
    }

    @Override
    public void UpdateFoodItem(int FoodId,Food UpdatedFood) {
        Food food = foodRepository.findById(FoodId).orElse(null);
        assert food != null;
        food.setPrice(UpdatedFood.getPrice());
        food.setName(UpdatedFood.getName());
    }

    @Override
    public void DeleteFoodItem(int FoodId) {
        Food food = foodRepository.findById(FoodId).orElse(null);
        assert food != null;
        foodRepository.delete(food);
    }
}
