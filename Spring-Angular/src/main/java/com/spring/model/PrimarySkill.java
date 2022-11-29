package com.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="primarySkill")
public class PrimarySkill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	@Column(name="skill_name")
	private String skill_name;
	@Column(name="skill_exp")
	private int skill_exp;
	@Column(name="rating")
	private int rating;
	@ManyToOne
	@JoinColumn(name="eid")
	private Employee employee;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public int getSkill_exp() {
		return skill_exp;
	}
	public void setSkill_exp(int skill_exp) {
		this.skill_exp = skill_exp;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public PrimarySkill(int sid, String skill_name, int skill_exp, int rating, Employee employee) {
		super();
		this.sid = sid;
		this.skill_name = skill_name;
		this.skill_exp = skill_exp;
		this.rating = rating;
		this.employee = employee;
	}
	public PrimarySkill() 
	{
		super();
	}
	@Override
	public String toString() {
		return "PrimarySkill [sid=" + sid + ", skill_name=" + skill_name + ", skill_exp=" + skill_exp + ", rating="
				+ rating + ", employee=" + employee + "]";
	}
	 
	
}
