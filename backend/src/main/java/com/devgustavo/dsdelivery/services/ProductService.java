package com.devgustavo.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devgustavo.dsdelivery.dto.ProductDTO;
import com.devgustavo.dsdelivery.entities.Product;
import com.devgustavo.dsdelivery.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public List<ProductDTO> findALL() {

		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	}
