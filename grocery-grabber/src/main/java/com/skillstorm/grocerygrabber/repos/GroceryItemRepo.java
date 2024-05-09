package com.skillstorm.grocerygrabber.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.grocerygrabber.models.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {
}
