package com.cdac.cdacpractice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
	private Integer id;
	private String zipcode;
	private String street;
	private String city;
	private String state;
	private String country;
}
