package com.cdns.banking.accountopen.strategy;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.cdns.banking.accountopen.model.AccountRequest;

/**
 * AccountOpenStrategy
 * 
 * @version 1.0
 */
public interface AccountOpenStrategy {

	/**
	 * openAccount
	 * 
	 * @param request AccountRequest
	 * @return String
	 * @throws URISyntaxException 
	 * @throws RestClientException 
	 */
	String sendOpenAccountRequest(AccountRequest request) throws RestClientException, URISyntaxException;

	/**
	 * getStrategy
	 * 
	 * @return AccountCreationStrategyNames
	 */
	AccountOpenStrategyNames getStrategy();
}
