package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class jobvacancy {
	
	@Id
	private String distric;
	private String jobname;
	private String discription;
	
	public jobvacancy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public jobvacancy(String distric, String jobname, String discription) {
		super();
		this.distric = distric;
		this.jobname = jobname;
		this.discription = discription;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "jobvacancy [distric=" + distric + ", jobname=" + jobname + ", discription=" + discription + "]";
	}
	
	
	

}
