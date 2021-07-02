package com.novi.eindopdracht.idrunk.controler;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Person;
import com.novi.eindopdracht.idrunk.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("")
    public ResponseEntity<Object> getPersons() {
        return ResponseEntity.ok(personService.getPersons());
    }

    @PostMapping("")
    public ResponseEntity<Object> addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return ResponseEntity.ok("Added");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPerson(@PathVariable("id") long id) throws RecordNotFoundException {
        Person person = personService.getPerson(id);
        return ResponseEntity.ok(person);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePerson(@PathVariable("id") long id, @RequestBody Person newPerson) throws RecordNotFoundException {
        personService.updatePerson(id, newPerson);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> removePerson(@PathVariable("id") long id) throws RecordNotFoundException {
        personService.removePerson(id);
        return ResponseEntity.noContent().build();
    }
}
