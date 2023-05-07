package com.skyPro.Learns.controller;

import com.skyPro.Learns.Service.PersonService;
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

    @GetMapping("/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        try {
            return personService.getPerson(number);
        } catch (BadPersonNumberException e) {
            return "Попробуйте другой номер";
        } catch (RuntimeException e) {
            return "Попробуйте в другой раз";
        }
    }
}
