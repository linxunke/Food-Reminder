package com.isc.remind.service;

import com.isc.remind.dao.entity.Food;

import java.util.List;

public interface ReminderService {

    List<Food> findAll();

}