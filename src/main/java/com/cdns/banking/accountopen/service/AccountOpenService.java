package com.cdns.banking.accountopen.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.cdns.banking.accountopen.model.AccountRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * AccountOpenService
 * 
 * @version 1.0
 */
public interface AccountOpenService {

	/**
	 * saveCustomerRequest
	 * 
	 * @param request AccountRequest
	 * @return String
	 * @throws JsonProcessingException
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	String validateAccountRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException;

	/**
	 * sendAccountOpenRequest
	 * 
	 * @param request AccountRequest
	 * @return String
	 * @throws JsonProcessingException
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	String sendAccountOpenRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException;

	String sendAccountCloseRequest(String accountNumber);
}
