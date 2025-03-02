package com.cdac.cdacpractice.entity;

import com.cdac.cdacpractice.util.Level;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Skill {
	private Integer skillId;
	private String name;
	private Level level;
}
