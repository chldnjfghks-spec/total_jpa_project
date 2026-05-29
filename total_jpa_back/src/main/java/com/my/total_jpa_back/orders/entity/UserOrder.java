package com.my.total_jpa_back.orders.entity;

import com.my.total_jpa_back.common.entity.BaseEntity;
import com.my.total_jpa_back.common.entity.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user_order")
public class UserOrder extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "product_name")
    private String productName;
    private Integer price;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;



}
