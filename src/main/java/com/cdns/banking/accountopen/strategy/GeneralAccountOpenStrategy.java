package com.cdns.banking.accountopen.strategy;

import com.cdns.banking.accountopen.model.AccountRequest;

/**
 * GeneralAccountOpenStrategy
 * 
 * @version 1.0
 */
public class GeneralAccountOpenStrategy implements AccountOpenStrategy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sendOpenAccountRequest(AccountRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountOpenStrategyNames getStrategy() {
		return AccountOpenStrategyNames.GENERAL_ACCOUNT_CREATION_STRATEGY;
	}

}
