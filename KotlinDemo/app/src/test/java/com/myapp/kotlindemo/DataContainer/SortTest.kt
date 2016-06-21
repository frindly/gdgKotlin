package com.myapp.kotlindemo.DataContainer

import com.myapp.kotlindemo.Sort.Solved.JavaPersonFilter
import com.myapp.kotlindemo.Sort.Solved.KotlinPersonFilter
import junit.framework.Assert.assertEquals
import org.junit.Test

class SortTest {
    @Test
    fun kotlinPersonFilterTest() {
        var filteredPeople = KotlinPersonFilter().getPeopleInAreaCode("503");
        assertEquals(6, filteredPeople.size);
        filteredPeople = KotlinPersonFilter().getPeopleInAreaCode("999");
        assertEquals(0, filteredPeople.size);
    }

    @Test
    fun javaPersonFilterTest() {
        var filteredPeople = JavaPersonFilter().getPeopleInAreaCode("503");
        assertEquals(6, filteredPeople.size);
        filteredPeople = JavaPersonFilter().getPeopleInAreaCode("000");
        assertEquals(0, filteredPeople.size);
    }
}