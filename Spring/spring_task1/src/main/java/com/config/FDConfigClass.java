package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Director;
import com.beans.Film;

@Configuration
public class FDConfigClass {
	
	@Bean(name = "myFilm")
	public Film getFilm() {
		return new Film("Shawshank Redemption","Philosophy",1994,new Director("manish","devlikar",20));
	}
}
