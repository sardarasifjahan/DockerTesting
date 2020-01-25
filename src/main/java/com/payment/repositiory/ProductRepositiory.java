package com.payment.repositiory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.payment.pojo.Product;
@Repository
public interface ProductRepositiory extends CrudRepository<Product,Integer>{

}
