package org.example.order.entity;

import lombok.Data;
import lombok.ToString;
import org.example.enums.OrderStatus;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@ToString
public class PurchaseOrder {

    @Id
    private UUID id;
    private Integer userId;
    private Integer productId;
    private Double price;
    private OrderStatus status;

}