package com.sastelvio.foodgram.controller;

import com.sastelvio.foodgram.entity.food.Food;
import com.sastelvio.foodgram.entity.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<Food> getAll(){
        //ToDo pesquisar sobre AtomicReference e porque o Intellij me recomendou isso
        //AtomicReference<List<Food>> foodList = new AtomicReference<>(repository.findAll());
        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
