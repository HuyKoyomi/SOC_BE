package com.example.SOC.respository;

import com.example.SOC.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRes extends JpaRepository<Orders, Integer> {
}
