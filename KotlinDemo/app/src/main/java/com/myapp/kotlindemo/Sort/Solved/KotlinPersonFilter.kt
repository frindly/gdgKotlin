package com.myapp.kotlindemo.Sort.Solved

import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson
import com.myapp.kotlindemo.PersonRepository

class KotlinPersonFilter {
    fun getPeopleInAreaCode(areaCode: String) : List<KotlinPerson>{
        return PersonRepository().GetAllPeople().filter { it.phoneNumber.startsWith(areaCode); }
    }
}