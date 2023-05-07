package com.skyPro.Learns.Service;

import com.skyPro.Learns.domain.Driver;
import com.skyPro.Learns.domain.Person;
import com.skyPro.Learns.domain.TruckDriver;
import com.skyPro.Learns.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    Person[] people = {
            new Person(
                    "Жан",
                    "Рено",
                    "1234",
                    2),
            new Person(
                    "Люк",
                    "Бессон",
                    "5673",
                    3),
            new Person(
                    "Жерар",
                    "Депардье",
                    "3179",
                    0),
            new Driver(
                    "Джейсон",
                    "Стетхем",
                    "9041",
                    "3491",
                    1),
            new TruckDriver(
                    "Роберт",
                    "Патрик",
                    "7412",
                    "2023",
                    5)
    };
    String[] professions = {
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= people.length) {
            throw new BadPersonNumberException();
        }
        person = people[number];
        final String personDescription = " " +
                person.getName() + " " +
                person.getSureName() + " " +
                person.getPassport() + " " +
                professions[person.getProfessionNumber()];
        return personDescription;
    }
}
