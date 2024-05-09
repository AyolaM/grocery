package com.skillstorm.grocerygrabber.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.grocerygrabber.models.OrderInfo;

public interface OrderInfoRepo extends JpaRepository<OrderInfo, Long> {
}

