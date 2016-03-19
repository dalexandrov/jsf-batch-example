package org.batch.job;

import org.batch.service.PersonService;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by dalexandrov on 18.03.16.
 * Credits to Arun Gupta
 */
@Named
public class BigBangWriter extends AbstractItemWriter {

    @Inject
    PersonService personService;

    @Override
    public void writeItems(List list) {
        System.out.println("Writing items: " + list);
        personService.getPersonList().addAll(list);
    }
}