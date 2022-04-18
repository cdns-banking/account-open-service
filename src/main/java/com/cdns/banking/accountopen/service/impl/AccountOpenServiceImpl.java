package com.cdns.banking.accountopen.service.impl;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.cdns.banking.accountopen.model.AccountRequest;
import com.cdns.banking.accountopen.service.AccountOpenService;
import com.cdns.banking.accountopen.strategy.AccountOpenStrategy;
import com.cdns.banking.accountopen.strategy.AccountOpenStrategyFactory;
import com.cdns.banking.accountopen.strategy.AccountOpenStrategyNames;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * AccountOpenServiceImpl
 * 
 * @version 1.0
 */
@Service
public class AccountOpenServiceImpl implements AccountOpenService {

	/**
	 * strategyFactory
	 */
	@Autowired
	private AccountOpenStrategyFactory strategyFactory;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String validateAccountRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException {
		AccountOpenStrategy strategy = strategyFactory
				.findStrategy(AccountOpenStrategyNames.STUDENT_ACCOUNT_CREATION_STRATEGY);
		return strategy.sendOpenAccountRequest(request);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sendAccountRequest(AccountRequest request)
			throws JsonProcessingException, RestClientException, URISyntaxException {
		AccountOpenStrategy strategy = strategyFactory
				.findStrategy(AccountOpenStrategyNames.GENERAL_ACCOUNT_CREATION_STRATEGY);
		return strategy.sendOpenAccountRequest(request);
	}
}
