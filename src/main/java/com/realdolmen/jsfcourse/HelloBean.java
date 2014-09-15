package com.realdolmen.jsfcourse;

import org.hibernate.validator.constraints.Length;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {
	private String name;
	
	public String convertNameToUpperCase() {
		name = name.toUpperCase();
		return "welcome";
	}

	@Length(min = 1, max = 100)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
