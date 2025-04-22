package com.doan.BMT_Shop.repository;

import com.doan.BMT_Shop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
