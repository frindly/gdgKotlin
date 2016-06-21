package com.myapp.kotlindemo.Map.Solved

import com.myapp.kotlindemo.PersonRepository

class KotlinCompanyMapper {

    fun findUniqueCompanies(): List<String> {
        return PersonRepository().GetAllPeople().map { it.company }.toSet().toList()
    }
}
