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
	 * requestType
	 */
	@Column(name = "request_type")
	private String requestType;

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
	 * @return requestID {@link Integer}
	 */
	public String getRequestID() {
		return requestID;
	}

	/**
	 * setRequestID
	 * 
	 * @param requestID {@link Integer}
	 */
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	/**
	 * getUserID
	 * 
	 * @return userID {@link Integer}
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID {@link Integer}
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * getRequestDescription
	 * 
	 * @return requestDescription {@link String}
	 */
	public String getRequestDescription() {
		return requestDescription;
	}

	/**
	 * setRequestDescription
	 * 
	 * @param requestDescription {@link String}
	 */
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	/**
	 * getRequestType
	 * 
	 * @return requestType {@link String}
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * setRequestType
	 * 
	 * @param requestType {@link String}
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * getRequestStatus
	 * 
	 * @return requestStatus {@link String}
	 */
	public String getRequestStatus() {
		return requestStatus;
	}

	/**
	 * setRequestStatus
	 * 
	 * @param requestStatus {@link String}
	 */
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	/**
	 * getRequestRemarks
	 * 
	 * @return requestRemarks {@link String}
	 */
	public String getRequestRemarks() {
		return requestRemarks;
	}

	/**
	 * setRequestRemarks
	 * 
	 * @param requestRemarks {@link String}
	 */
	public void setRequestRemarks(String requestRemarks) {
		this.requestRemarks = requestRemarks;
	}
}
