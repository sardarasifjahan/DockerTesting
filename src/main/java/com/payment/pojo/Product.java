package com.payment.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	int pid;
	String pname;
	String paddr;

}
