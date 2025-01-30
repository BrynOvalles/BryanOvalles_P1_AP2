package edu.ucne.bryanovalles_p1_ap2.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entidad")
class ObjetoEntity(
    @PrimaryKey
    val entityId: Int? = null,
)