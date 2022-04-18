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
	 * @param request {@link AccountRequest}
	 * @return {@link String}
	 * @throws JsonProcessingException
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	String validateAccountRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException;
	
	/**
	 * 
	 * @param request AccountRequest
	 * @return String
	 * @throws JsonProcessingException
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	String sendAccountRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException;
}
