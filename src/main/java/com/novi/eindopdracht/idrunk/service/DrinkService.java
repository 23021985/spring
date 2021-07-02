package com.novi.eindopdracht.idrunk.service;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Drink;

import java.util.List;

public interface DrinkService {

    List<Drink> getDrinks();
    Drink getDrink(long id) throws RecordNotFoundException;
    Drink addDrink(Drink drink);
    void removeDrink(long id) throws RecordNotFoundException;
    void updateDrink(long id, Drink drink) throws RecordNotFoundException;


}
