package com.example.SOC.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cardType")
    private String cardType;

    @Column(name = "cardNumber")
    private String cardNumber;

    @Column(name = "cvc")
    private String cvc;

    @Column(name = "due")
    private String due;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    @JsonIgnore // không hiển thị thuộc tính trong câu select
    @Fetch(FetchMode.JOIN)
    private List<Orders> ordersList;
}
