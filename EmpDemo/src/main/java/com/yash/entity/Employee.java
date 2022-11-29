package com.yash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Employee {

	@Id
	@Column (name = "id")
	private int id;
	@Column (name = "total_experience")
	private int total_experience;
	@Column (name= "project_allocated")
	private String project_allocated;
	@Column (name = "project_name")
	private String project_name;
	@Column (name = "lworking_date")
	private String lworking_date;
	// private String UploadedResume;
	// @Lob
	// private byte UploadResume;
	@Column (name = "interests")
	private String interests;
	@Column (name = "yashemail_address")
	private String yashemail_address;
	@Column (name = "mobile_no")
	private int mobile_no;
	@Column (name = "yash_base_location")
	private String yash_base_location;
	@Column (name = "preferedlocation")
	private String preferedlocation;
	@Column (name = "ctc")
	private int ctc;
	@Column (name = "date_of_joining")
	private String date_of_joining;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int total_experience, String project_allocated, String project_name,
			String lworking_date, String interests, String yashemail_address, int mobile_no, String yash_base_location,
			String preferedlocation, int ctc, String date_of_joining) {
		super();
		this.id = id;
		this.total_experience = total_experience;
		this.project_allocated = project_allocated;
		this.project_name = project_name;
		this.lworking_date = lworking_date;
		this.interests = interests;
		this.yashemail_address = yashemail_address;
		this.mobile_no = mobile_no;
		this.yash_base_location = yash_base_location;
		this.preferedlocation = preferedlocation;
		this.ctc = ctc;
		this.date_of_joining = date_of_joining;
	}
	
	public int getTotal_experience() {
		return total_experience;
	}
	public void setTotal_experience(int total_experience) {
		this.total_experience = total_experience;
	}
	public String getProject_allocated() {
		return project_allocated;
	}
	public void setProject_allocated(String project_allocated) {
		this.project_allocated = project_allocated;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getLworking_date() {
		return lworking_date;
	}
	public void setLworking_date(String lworking_date) {
		this.lworking_date = lworking_date;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getYashemail_address() {
		return yashemail_address;
	}
	public void setYashemail_address(String yashemail_address) {
		this.yashemail_address = yashemail_address;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getYash_base_location() {
		return yash_base_location;
	}
	public void setYash_base_location(String yash_base_location) {
		this.yash_base_location = yash_base_location;
	}
	public String getPreferedlocation() {
		return preferedlocation;
	}
	public void setPreferedlocation(String preferedlocation) {
		this.preferedlocation = preferedlocation;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", total_experience=" + total_experience
				+ ", project_allocated=" + project_allocated + ", project_name=" + project_name + ", lworking_date="
				+ lworking_date + ", interests=" + interests + ", yashemail_address=" + yashemail_address
				+ ", mobile_no=" + mobile_no + ", yash_base_location=" + yash_base_location + ", preferedlocation="
				+ preferedlocation + ", ctc=" + ctc + ", date_of_joining=" + date_of_joining + "]";
	}

}