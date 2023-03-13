package com.orderManagement.orderApi.Service;

import com.orderManagement.orderApi.Entity.Customer;
import com.orderManagement.orderApi.Entity.Food;

import java.util.List;

public interface FoodService {

    public List<Food> getAllFoodItem();

    public Food getFoodItemById(int FoodId);

    public Food getFoodItemByName(String FoodName);

    public void addFoodItem(Food food);

    public void UpdateFoodItem(int FoodId,Food food);

    public void DeleteFoodItem(int FoodId);
}
