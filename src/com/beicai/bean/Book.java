package com.beicai.bean;

import java.io.Serializable;

public class Book implements Serializable {
	private Integer id;
	
	private String name;
	private String writer;
	private Double price;
	

	public Book(String name, String writer, Double price) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
	}

	public Book(Integer id, String name, String writer, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.writer = writer;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.writer + "\t" + this.price;
	}

}
