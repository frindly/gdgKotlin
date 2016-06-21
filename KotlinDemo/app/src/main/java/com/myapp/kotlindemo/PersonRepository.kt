package com.myapp.kotlindemo

import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson

class PersonRepository {
    fun GetAllPeople(): List<KotlinPerson> {
        return listOf(
                KotlinPerson(1, "Jake", "eBay", "ebay.com", "503.555.5555", "jake@test.com"),
                KotlinPerson(2, "Larry", "eBay", "ebay.com", "503.555.5555", "larry@test.com"),
                KotlinPerson(3, "Anton", "eBay", "ebay.com", "503.555.5555", "anton@test.com"),
                KotlinPerson(4, "Fred", "WebMD", "webmd.com", "503.555.5555", "fred@webmd.com"),
                KotlinPerson(5, "James", "Nike", "nike.com", "503.555.5555", "james@nike.com"),
                KotlinPerson(6, "Katie", "Walmart Labs", "walmart.com", "503.555.5555", "katie@walmart.com"),
                KotlinPerson(8, "Alice", "Google", "google.com", "404.555.5555", "alice@google.com"),
                KotlinPerson(8, "Jed", "JetBrains", "jetbrains.com", "332.555.5555", "jed@jetbrains.com"),
                KotlinPerson(9, "Jim", "JetBrains", "tesla.com", "404.555.5555", "jim@jetbrains.com"),
                KotlinPerson(10, "Lois", "Uber", "uber.com", "199.555.5555", "lois@uber.com"));
    }
}