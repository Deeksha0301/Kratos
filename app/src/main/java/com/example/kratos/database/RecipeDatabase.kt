package com.example.kratos

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kratos.dao.RecipeDao
import com.example.kratos.entities.Recipies

@Database(entities = [Recipies :: class], version =1)
abstract class RecipeDatabase : RoomDatabase() {

    abstract fun RecipeDao() : RecipeDao

    companion object{

        @Volatile
        private var INSTANCE : RecipeDatabase? = null

        fun getDatabase(context: Context): RecipeDatabase{

            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}