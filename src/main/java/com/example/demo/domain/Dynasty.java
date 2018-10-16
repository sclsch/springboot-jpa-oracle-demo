package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@javax.persistence.Table(name = "t_dynasty")
@javax.persistence.Entity
public class Dynasty {
	/**
	 * 
	 * id
	 * 
	 */

	@Id

	@GenericGenerator(name = "system-uuid", strategy = "uuid")

	@GeneratedValue(generator = "system-uuid")

	@Column(name = "id")

	private String id;

	@Column(name = "name")

	private String name;

	@Column(name = "startYear")

	private String startYear;

	@Column(name = "endYear")

	private String endYear;

	@Column(name = "age")

	private Integer age;

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getStartYear() {

		return startYear;

	}

	public void setStartYear(String startYear) {

		this.startYear = startYear;

	}

	public String getEndYear() {

		return endYear;

	}

	public void setEndYear(String endYear) {

		this.endYear = endYear;

	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}