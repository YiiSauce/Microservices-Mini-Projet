package com.miniprojet.orderserver.repository;

import com.miniprojet.orderserver.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
