package com.myapp.kotlindemo

import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson

class PersonRepository {
    fun GetAllPeople(): List<KotlinPerson> {
        return listOf(KotlinPerson(1, "Jake", "ebay", "ebay.com", "503.555.5555", "jake@test.com"),
                KotlinPerson(2, "Fred", "WebMD", "webmd.com", "503.555.5555", "fred@webmd.com"),
                KotlinPerson(3, "James", "Nike", "nike.com", "503.555.5555", "james@nike.com"),
                KotlinPerson(4, "Katie", "Walmart Labs", "walmart.com", "503.555.5555", "katie@walmart.com"),
                KotlinPerson(5, "Alice", "Google", "google.com", "404.555.5555", "alice@google.com"),
                KotlinPerson(6, "Jed", "JetBrains", "jetbrains.com", "332.555.5555", "jed@jetbrains.com"),
                KotlinPerson(7, "Jim", "Tesla", "tesla.com", "404.555.5555", "jim@tesla.com"),
                KotlinPerson(8, "Lois", "Uber", "uber.com", "199.555.5555", "lois@uber.com"));
    }
}