package edu.ucne.bryanovalles_p1_ap2.data.local.database

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Database(
    entities = [Entity::class],
    version = 1,
    exportSchema = false
)
abstract class DataBase : RoomDatabase() {
    abstract fun Dao(): Dao
}

