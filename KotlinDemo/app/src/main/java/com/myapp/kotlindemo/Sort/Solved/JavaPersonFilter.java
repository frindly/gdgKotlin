package com.myapp.kotlindemo.Sort.Solved;

import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson;
import com.myapp.kotlindemo.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class JavaPersonFilter {
    public List<KotlinPerson> getPeopleInAreaCode(String areaCode) {
        List<KotlinPerson> filteredPeople = new ArrayList<>();
        for (KotlinPerson person : new PersonRepository().GetAllPeople()) {
            if (person.getPhoneNumber().startsWith(areaCode)) {
                filteredPeople.add(person);
            }
        }
        return filteredPeople;
    }
}
