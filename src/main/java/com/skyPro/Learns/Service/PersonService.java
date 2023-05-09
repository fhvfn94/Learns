package com.skyPro.Learns.Service;

import com.skyPro.Learns.domain.Person;

public interface PersonService {
    public String getPerson(Integer number);

    void addPerson(Person person);
}
