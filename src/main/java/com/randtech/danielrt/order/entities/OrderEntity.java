package com.randtech.danielrt.order.entities;

import com.randtech.danielrt.order.enums.OrderStatus;
import com.randtech.danielrt.utils.entities.AbstractEntity;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "order")
public class OrderEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_date")
    private Date moment;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

}
