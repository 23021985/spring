package com.novi.eindopdracht.idrunk.service;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Drink;
import com.novi.eindopdracht.idrunk.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DrinkServiceImpl implements DrinkService{

    @Autowired
    DrinkRepository drinkRepository;
    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink getDrink(long id) throws RecordNotFoundException {
        return drinkRepository.getById(id);
    }

    @Override
    public Drink addDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public void removeDrink(long id) throws RecordNotFoundException {
        drinkRepository.deleteById(id);
    }

    @Override
    public void updateDrink(long id, Drink drink) throws RecordNotFoundException {
    }
}
