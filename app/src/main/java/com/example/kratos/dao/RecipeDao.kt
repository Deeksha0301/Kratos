package com.example.kratos.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.kratos.entities.Recipies
import androidx.room.OnConflictStrategy


@Dao
interface RecipeDao {
//    @get:Query(value = "SELECT * FROM recipies ORDER BY id DESC")
//    val allRecipies: List<Recipies>

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertRecipe(recipies: Recipies )

    @Query("SELECT * FROM recipies")
    fun getAll(): List<Recipies>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert (recipies: Recipies )
}