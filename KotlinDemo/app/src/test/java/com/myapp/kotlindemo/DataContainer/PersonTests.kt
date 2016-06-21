package com.myapp.kotlindemo.DataContainer

import com.myapp.kotlindemo.DataContainer.Solved.JavaPerson
import com.myapp.kotlindemo.DataContainer.Solved.KotlinPerson

import org.junit.Test

import junit.framework.Assert.assertEquals
import org.junit.Assert.assertNotEquals

class PersonTests {
    @Test
    @Throws(Exception::class)
    fun kotlinPersonTests() {
        val kotlinPerson = KotlinPerson(1, "Jake", "eBay", "ebay.com", "555.555.5555", "jake@test.com")
        assertEquals(kotlinPerson, kotlinPerson)
        val kotlinPerson2 = KotlinPerson(1, "James", "eBay", "ebay.com", "555.555.5555", "jake@test.com")
        assertNotEquals(kotlinPerson, kotlinPerson2)
    }

    @Test
    @Throws(Exception::class)
    fun javaPersonTests() {
        val javaPerson = JavaPerson(1, "Jake", "eBay", "ebay.com", "555.555.5555", "jake@test.com")
        assertEquals(javaPerson, javaPerson)
        val kotlinPerson2 = JavaPerson(1, "James", "eBay", "ebay.com", "555.555.5555", "jake@test.com")
        assertNotEquals(javaPerson, kotlinPerson2)
    }
}