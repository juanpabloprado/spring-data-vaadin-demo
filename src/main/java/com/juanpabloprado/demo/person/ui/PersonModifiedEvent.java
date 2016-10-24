package com.juanpabloprado.demo.person.ui;

import com.juanpabloprado.demo.person.Person;
import java.io.Serializable;

public class PersonModifiedEvent implements Serializable {

    private final Person person;

    public PersonModifiedEvent(Person p) {
        this.person = p;
    }

    public Person getPerson() {
        return person;
    }
    
}
