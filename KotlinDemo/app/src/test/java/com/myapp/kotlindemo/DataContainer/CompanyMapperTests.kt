package com.myapp.kotlindemo.DataContainer

import com.myapp.kotlindemo.Map.Solved.JavaCompanyMapper
import com.myapp.kotlindemo.Map.Solved.KotlinCompanyMapper
import junit.framework.Assert.assertEquals
import org.junit.Test

class CompanyMapperTests {

    @Test
    fun testKotlinMapper() {
        val results = KotlinCompanyMapper().findUniqueCompanies()
        assertEquals(results.size, 7);
    }

    @Test
    fun testJavaMapper() {
        val results = JavaCompanyMapper().findUniqueCompanies()
        assertEquals(results.size, 7);
    }
}