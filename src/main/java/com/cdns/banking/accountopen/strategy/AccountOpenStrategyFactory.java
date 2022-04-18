package com.cdns.banking.accountopen.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * AccountOpenStrategyFactory
 * 
 * @version 1.0
 */
public class AccountOpenStrategyFactory {

	/**
	 * strategies
	 */
	private Map<AccountOpenStrategyNames, AccountOpenStrategy> strategies;

	/**
	 * AccountCreationStrategyFactory constructor
	 * 
	 * @param strategySet Set<AccountCreationStrategy>
	 */
	@Autowired
	public AccountOpenStrategyFactory(Set<AccountOpenStrategy> strategySet) {
		createStrategy(strategySet);
	}

	/**
	 * findStrategy
	 * 
	 * @param strategyName AccountCreationStrategyNames
	 * @return AccountCreationStrategy
	 */
	public AccountOpenStrategy findStrategy(AccountOpenStrategyNames strategyName) {
		return strategies.get(strategyName);
	}

	/**
	 * createStrategy
	 * 
	 * @param strategySet Set<AccountCreationStrategy>
	 */
	private void createStrategy(Set<AccountOpenStrategy> strategySet) {
		strategies = new HashMap<AccountOpenStrategyNames, AccountOpenStrategy>();
		strategySet.forEach(strategy -> strategies.put(strategy.getStrategy(), strategy));
	}
}
