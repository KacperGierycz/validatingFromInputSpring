package com.example.validatingforminput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
	
	@NotNull
	@Size(min=2, max=30)
	private Integer name;
	
	@NotNull
	@Min(18)
	private Integer age;

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}
	


}
