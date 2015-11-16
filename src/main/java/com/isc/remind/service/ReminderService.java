package com.isc.remind.service;

import com.isc.remind.entity.Food;

import java.util.List;

public interface ReminderService {

    List<Food> findAll();

}