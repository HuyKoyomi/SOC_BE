package com.example.SOC.model;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "orderNumber")
    private String orderNumber;

    @Column(name = "product")
    private String product;

    @Column(name = "companyID")
    private String companyID;

        @Column(name = "quantity")
    private int quantity;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "cardId", referencedColumnName = "id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Card card;
}
