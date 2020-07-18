/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleviews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class MyPersonWarehouse implements PersonWarehouse {
    private List<Person> warehouse;

    public MyPersonWarehouse() {
        this.warehouse = new ArrayList<>();
    }

    @Override
    public void save(Person person) {
        warehouse.add(person);
    }

    @Override
    public Person search(String socialSecurityNumber) {
        Iterator<Person> it = warehouse.iterator();
        while (it.hasNext()) {
            Person next = it.next();
            if (next.getSocialSecurityNumber().equals(socialSecurityNumber)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public void delete(Person person) {
        warehouse.remove(person);
    }

    @Override
    public void delete(String socialSecurityNumber) {
        Iterator<Person> it = warehouse.iterator();
        while (it.hasNext()) {
            Person next = it.next();
            if (next.getSocialSecurityNumber().equals(socialSecurityNumber)) {
                warehouse.remove(next);
            }
        }
    }

    @Override
    public void deleteAll() {
        warehouse.removeAll(warehouse);
    }

    @Override
    public Collection<Person> getAll() {
        return warehouse;
    }

}
