package com.devgustavo.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavo.dsdelivery.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {
	

}
