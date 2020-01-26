package com.example.myapplication.data.dao

import androidx.room.*
import com.example.myapplication.data.model.Employee

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employee")
    fun getAll(): List<Employee>

    @Query("SELECT * FROM employee WHERE id = :id")
    fun getById(id: Long): Employee

    @Insert
    fun insert()

    @Update
    fun update()

    @Delete
    fun delete()
}