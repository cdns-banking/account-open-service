package com.cdns.banking.accountopen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * AccountRequest
 * 
 * @version 1.0
 */
@Entity
@Table(name = "t_account_requests")
public class AccountRequest {

	/**
	 * requestID
	 */
	@Id
	@GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "request_id")
	private String requestID;

	/**
	 * userID
	 */
	@Column(name = "userid")
	private String userID;

	/**
	 * requestDescription
	 */
	@Column(name = "request_description")
	private String requestDescription;

	/**
	 * accountType
	 */
	@Column(name = "account_type")
	private String accountType;

	/**
	 * requestStatus
	 */
	@Column(name = "request_status")
	private String requestStatus;

	/**
	 * requestRemarks
	 */
	@Column(name = "request_remarks")
	private String requestRemarks;

	/**
	 * getRequestID
	 * 
	 * @return requestID Integer
	 */
	public String getRequestID() {
		return requestID;
	}

	/**
	 * setRequestID
	 * 
	 * @param requestID Integer
	 */
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	/**
	 * getUserID
	 * 
	 * @return userID Integer
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID Integer
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * getRequestDescription
	 * 
	 * @return requestDescription String
	 */
	public String getRequestDescription() {
		return requestDescription;
	}

	/**
	 * setRequestDescription
	 * 
	 * @param requestDescription String
	 */
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	/**
	 * getRequestStatus
	 * 
	 * @return requestStatus String
	 */
	public String getRequestStatus() {
		return requestStatus;
	}

	/**
	 * setRequestStatus
	 * 
	 * @param requestStatus String
	 */
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	/**
	 * getRequestRemarks
	 * 
	 * @return requestRemarks String
	 */
	public String getRequestRemarks() {
		return requestRemarks;
	}

	/**
	 * setRequestRemarks
	 * 
	 * @param requestRemarks String
	 */
	public void setRequestRemarks(String requestRemarks) {
		this.requestRemarks = requestRemarks;
	}

	/**
	 * getAccountType
	 * 
	 * @return String
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * setAccountType
	 * 
	 * @param accountType String
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
