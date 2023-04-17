package com.example.SOC.respository;

import com.example.SOC.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRes extends JpaRepository<Card, Integer> {
}
