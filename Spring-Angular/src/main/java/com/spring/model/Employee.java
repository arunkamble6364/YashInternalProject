package com.spring.model;

	import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eid")
	private Long eid;

	
	@Column(name="emailId")
	private String emailId;
	
	
	
	@Column(name="total_year_of_exp")
	private int total_year_of_exp;
	
	@Column(name="projectname")
	private String projectname;
	
	@Column(name="last_working_date")
	private Date last_working_date;
	
	@Column(name="project_Status")
	private String project_Status;
	

	
	
	@Column(name="base_location")
	private String base_location;
	
	@Column(name="preffered_location")
	private String preffered_location;
	
	@Column(name="ctc")
	private String ctc;
	
	@Column(name="date_of_joining")
	private Date date_of_joining;
	
	
	
	
	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public int getTotal_year_of_exp() {
		return total_year_of_exp;
	}

	public void setTotal_year_of_exp(int total_year_of_exp) {
		this.total_year_of_exp = total_year_of_exp;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public Date getLast_working_date() {
		return last_working_date;
	}

	public void setLast_working_date(Date last_working_date) {
		this.last_working_date = last_working_date;
	}

	public String getProject_Status() {
		return project_Status;
	}

	public void setProject_Status(String project_Status) {
		this.project_Status = project_Status;
	}

	

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getPreffered_location() {
		return preffered_location;
	}

	public void setPreffered_location(String preffered_location) {
		this.preffered_location = preffered_location;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	public Employee(Long eid, String emailId, int total_year_of_exp, String projectname, Date last_working_date,
			String project_Status, String base_location, String preffered_location, String ctc, Date date_of_joining,
			User user) {
		super();
		this.eid = eid;
		this.emailId = emailId;
		this.total_year_of_exp = total_year_of_exp;
		this.projectname = projectname;
		this.last_working_date = last_working_date;
		this.project_Status = project_Status;
		this.base_location = base_location;
		this.preffered_location = preffered_location;
		this.ctc = ctc;
		this.date_of_joining = date_of_joining;
	}

	

	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", emailId=" + emailId + ", total_year_of_exp=" + total_year_of_exp
				+ ", projectname=" + projectname + ", last_working_date=" + last_working_date + ", project_Status="
				+ project_Status + ", base_location=" + base_location + ", preffered_location=" + preffered_location
				+ ", ctc=" + ctc + ", date_of_joining=" + date_of_joining + "]";
	}



}


