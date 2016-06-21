package com.myapp.kotlindemo.Map.Solved;


import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson;
import com.myapp.kotlindemo.PersonRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaCompanyMapper {
    public List<String> findUniqueCompanies() {
        Set<String> companies = new HashSet<>();
        for (KotlinPerson person : new PersonRepository().GetAllPeople()) {
            companies.add(person.getCompany());
        }
        return new ArrayList<>(companies);
    }
}
