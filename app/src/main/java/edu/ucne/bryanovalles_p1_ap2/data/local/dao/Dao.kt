package edu.ucne.bryanovalles_p1_ap2.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.bryanovalles_p1_ap2.data.local.entity.ObjetoEntity
import edu.ucne.bryanovalles_p1_ap2.data.repository.Entity
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Upsert()
    suspend fun save(objetoEntity: ObjetoEntity)

    @Query(
        """
            SELECT *
            FROM "entidad"
            WHERE entityId=:id
            LIMIT 1
        """
    )
    suspend fun find(id: Int): Entity?

    @Delete
    suspend fun delete(objetoEntity: ObjetoEntity)

    @Query("SELECT * FROM entidad")
    fun getAll(): Flow<List<Entity>>
}