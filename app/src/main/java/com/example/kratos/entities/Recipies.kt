package com.example.kratos.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Recipies")
data class Recipies(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name="DOB") val dob: Int?,
    @ColumnInfo(name="ABC") val abc: Int?

)
