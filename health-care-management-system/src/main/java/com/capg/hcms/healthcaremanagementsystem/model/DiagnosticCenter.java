package com.capg.hcms.healthcaremanagementsystem.model;

import java.math.BigInteger;
import java.util.List;
public class DiagnosticCenter {

	private String centerId;	
	private String centerName;
	private List<String> tests;
	private List<BigInteger> appointments;
	
	
	public DiagnosticCenter() {
		super();
	}
	
	public DiagnosticCenter(String centerId, String centerName, List<String> tests,
			List<BigInteger> appointments) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.tests = tests;
		this.appointments = appointments;
	}

	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	public List<String> getTests() {
		return tests;
	}


	public void setTests(List<String> tests) {
		this.tests = tests;
	}


	public List<BigInteger> getAppointments() {
		return appointments;
	}


	public void setAppointments(List<BigInteger> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centerId=" + centerId + ", centerName=" + centerName + ", testId=" + tests
				+ ", appointmentId=" + appointments + "]";
	}
	
	
}
