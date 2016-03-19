package org.batch.service;

import org.batch.model.Person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitia on 18.03.16.
 */
@ApplicationScoped
@Named
public class PersonService {

    private List<Person> personList;

    @PostConstruct
    void init(){
        personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
