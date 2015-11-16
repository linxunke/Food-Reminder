package com.isc.remind.service;

import com.isc.remind.dao.FoodDao;
import com.isc.remind.dao.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foodService")
public class ReminderServiceImpl implements FoodService {

    FoodDao foodDao;

    @Autowired
    public void setFoodDao(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @Override
    public List<Food> findAll() {
        return foodDao.findAll();
    }

}
