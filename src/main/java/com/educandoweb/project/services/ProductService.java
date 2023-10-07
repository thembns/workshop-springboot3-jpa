package com.educandoweb.project.services;

import com.educandoweb.project.entities.Product;
import com.educandoweb.project.entities.User;
import com.educandoweb.project.repositories.ProductRepository;
import com.educandoweb.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
