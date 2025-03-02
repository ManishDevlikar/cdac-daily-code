package com.cdac.cdacpractice.entity;

import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Candidate {
	private Integer candidateId;
	private String name;
	private Collection<Skill> skills;
	private Address address;
	
}
