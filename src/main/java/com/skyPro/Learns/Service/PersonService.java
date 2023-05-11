package com.skyPro.Learns.Service;

import com.skyPro.Learns.domain.Person;

public interface PersonService {
/*    public String getPerson(Integer number);*/

    String getPersonByPassport(String passport);

    void addProfession(String passport, Integer profession);

    void addPerson(Person person);
}
