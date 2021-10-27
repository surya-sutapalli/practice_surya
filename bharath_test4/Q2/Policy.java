package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	@Id
	@Column(name = "policyid")
	private int policyId;
	@Column(name = "policyName")
	private String policyName;
	@Column(name = "policyAmount")
	private int policyAmount;
	@Column(name = "policyDuration")
	private String policyDuration;
	public int getPolicyId() {
		return policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String getPolicyDuration() {
		return policyDuration;
	}
	public void setPolicyDuration(String policyDuration) {
		this.policyDuration = policyDuration;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
}
