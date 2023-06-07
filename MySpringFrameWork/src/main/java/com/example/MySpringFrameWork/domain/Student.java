package com.example.MySpringFrameWork.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_data")
public class Student {
	 
	@Id
	@GeneratedValue
	@Column(name="SN")
	 private int sn;
	
	@Column(name="stdname")
    private String stdname;
	@Column(name="cname")
    private String cname;
	@Column(name="id")
    private String id;
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
}
