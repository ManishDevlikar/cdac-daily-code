package com.config;

import org.springframework.context.annotation.Bean;

import com.beans.Director;
import com.beans.Film;

public class SpringConfigByJava {

	@Bean(name = "myFilm")
	public Film getFilm() {
		return new Film("Shawshank Redemption","Philosophy",1994,new Director("manish","devlikar",20));
	}

}
