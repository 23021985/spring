package com.novi.eindopdracht.idrunk;

import com.novi.eindopdracht.idrunk.model.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void myFirstUnitTest() {

        //Arrange
        Person person = new Person();

        //Act
        person.setName("Hans");

        //Assert
        assertEquals("Hans", person.getName());
    }
}
