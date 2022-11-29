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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="secondary_skill")
public class SecondarySkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="skid")
	private int skid;
	@Column(name="skill_name")
	private String skill_name;
	@Column(name="skill_exp")
	private int skill_exp;
	@Column(name="rating")
	private int rating;
	
	@ManyToOne
	@JoinColumn(name="eid")
	private Employee employee;

	
	public int getSkid() {
		return skid;
	}

	public void setSkid(int skid) {
		this.skid = skid;
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

	public SecondarySkill() {
		super();
	}

	public SecondarySkill(int skid, String skill_name, int skill_exp, int rating, Employee employee) {
		super();
		this.skid = skid;
		this.skill_name = skill_name;
		this.skill_exp = skill_exp;
		this.rating = rating;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "SecondarySkill [skid=" + skid + ", skill_name=" + skill_name + ", skill_exp=" + skill_exp + ", rating="
				+ rating + ", employee=" + employee + "]";
	}

	 
}
