package com.example.leducphuc.database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemDao {
    @Insert(onConflict = REPLACE)
    long insertItem(ItemEntity item);


    @Query("SELECT * FROM Item")
    List<ItemEntity> getAllItem();

    @Query("SELECT * FROM Item WHERE id = :id")
    ItemEntity getItem(int id);

    @Query("DELETE FROM Item")
    void deleteAll();
}
