package com.skyPro.Learns.Service;

import com.skyPro.Learns.domain.Driver;
import com.skyPro.Learns.domain.Person;
import com.skyPro.Learns.domain.TruckDriver;
import com.skyPro.Learns.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    HashMap<String, Person> people = new HashMap<>(Map.of(
            "1234",
            new Person(
                    "Жан",
                    "Рено",
                    "1234",
                    2),
            "5673",
            new Person(
                    "Люк",
                    "Бессон",
                    "5673",
                    3),
            "3179",
            new Person(
                    "Жерар",
                    "Депардье",
                    "3179",
                    0),
            "9041",
            new Driver(
                    "Джейсон",
                    "Стетхем",
                    "9041",
                    "3491",
                    1),
            "7412",
            new TruckDriver(
                    "Роберт",
                    "Патрик",
                    "7412",
                    "2023",
                    5)
    ));
    List<String> professions = new ArrayList<>(List.of(
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    ));

   /* @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= people.size()) {
            throw new BadPersonNumberException("Ошибка BadPersonNumberException");
        }
        person = people.get(number);
        final String personDescription = " " +
                person.getName() + " " +
                person.getSureName() + " " +
                person.getPassport() + " " +
                professions.get(person.getProfessionNumber());
        return personDescription;
    }*/

    @Override
    public String getPersonByPassport(String passport) {
        final Person person = people.get(passport);
        if (person == null) {
            throw new RuntimeException("Такого паспорт не нашлось");
        }
        final String personDescription = " " +
                person.getName() + " " +
                person.getSureName() + " " +
                person.getPassport() + " " +
                professions.get(person.getProfessionNumber());
        return personDescription;
    }

    @Override
    public void addPerson(Person person) {
        people.put(person.getPassport(), person);
    }
}
