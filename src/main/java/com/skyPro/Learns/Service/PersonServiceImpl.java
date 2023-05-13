package com.skyPro.Learns.Service;

import com.skyPro.Learns.domain.Driver;
import com.skyPro.Learns.domain.Person;
import com.skyPro.Learns.domain.TruckDriver;
import org.springframework.stereotype.Service;

import java.util.*;

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
            "столяр",
            "актер"
    ));

    public List<Person> getPersonByProfession(Integer professionNumber) {
        List<Person> result = new ArrayList<>();
        for (Person person : people.values()) {
            if (person.getProfessionNumber().contains(professionNumber)) {
                result.add(person);
            }
        }
        return result;
    }
    @Override
    public List<Person> getPersonByProfessions(List<Integer> professionNumbers) {
        List<Person> result = new ArrayList<>();
        for (Person person : people.values()) {
            if (person.getProfessionNumber().containsAll(professionNumbers)) {
                result.add(person);
            }
        }
        return result;
    }
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
                getProfessionNames(person.getProfessionNumber());
        return personDescription;
    }

    private String getProfessionNames(Set<Integer> professionNumbers) {
        String result = "";
        for (Integer professionNumber : professionNumbers) {
            result = result + " " + professions.get(professionNumber);
        }
        return result;
    }

    @Override
    public void addProfession(String passport, Integer profession) {
        final Person person = people.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        person.getProfessionNumber().add(profession);
        /*if (!person.getProfessionNumber().contains(profession)) {
            person.getProfessionNumber().add(profession);
        }*/
    }

    @Override
    public void addPerson(Person person) {
        people.put(person.getPassport(), person);
    }
}
