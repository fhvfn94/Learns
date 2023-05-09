package com.skyPro.Learns.controller;

import com.skyPro.Learns.Service.PersonService;
import com.skyPro.Learns.domain.Person;
import com.skyPro.Learns.exceptions.BadPersonNumberException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    /*@GetMapping("/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        try {
            return personService.getPerson(number);
        } catch (BadPersonNumberException e) {
            return "Попробуйте другой номер 1";
        } catch (RuntimeException e) {
            return "Попробуйте в другой раз 2";
        } finally {
            System.out.println("цикл закончен");
        }
    }*/

    @GetMapping("/person/passport")
    public String getPersonInfo(@RequestParam("passport") String passport) {
        return personService.getPersonByPassport(passport);
    }

    @GetMapping("/person/add")
    public String addPerson(
            @RequestParam("name") String name,
            @RequestParam("sureName") String sureName,
            @RequestParam("passport") String passport,
            @RequestParam("professionNumber") Integer professionNumber
    ) {
        Person person = new Person(name, sureName, passport, professionNumber);
        personService.addPerson(person);
        return "add Person";
    }
}
