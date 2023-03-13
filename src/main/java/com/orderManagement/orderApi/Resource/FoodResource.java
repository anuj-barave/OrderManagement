package com.orderManagement.orderApi.Resource;

import com.orderManagement.orderApi.Entity.Customer;
import com.orderManagement.orderApi.Entity.Food;
import com.orderManagement.orderApi.ServiceImpl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodResource {

    @Autowired
    FoodServiceImpl foodService;

    @RequestMapping(value = "/food",method = RequestMethod.POST)
    public void addCusotmers(@RequestBody Food food) {
        foodService.addFoodItem(food);
    }

    @RequestMapping(value = "/food",method = RequestMethod.GET)
    public List<Food> GetAllFoodItem() {
        return foodService.getAllFoodItem();
    }

    @RequestMapping(value = "/food/{foodName}",method = RequestMethod.GET)
    public Food GetSpecificFoodByName(@PathVariable String foodName) {
        return foodService.getFoodItemByName(foodName);
    }

    @RequestMapping(value = "/food/{foodId}",method = RequestMethod.GET)
    public Food GetSpecficFoodById(@PathVariable int foodId) {
        return foodService.getFoodItemById(foodId);
    }

    @RequestMapping(value="/food/{foodId}",method = RequestMethod.PUT)
    public void UpdatefoodById(@PathVariable int foodId,@RequestBody Food food)
    {
        foodService.UpdateFoodItem(foodId,food);
    }

    @RequestMapping(value = "/food/{foodId}",method = RequestMethod.DELETE)
    public void DeleteFood(@PathVariable int foodId) {
        foodService.DeleteFoodItem(foodId);
    }


}
