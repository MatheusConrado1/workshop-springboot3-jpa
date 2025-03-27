package com.matheusconrado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusconrado.course.entities.OrderItem;
import com.matheusconrado.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
