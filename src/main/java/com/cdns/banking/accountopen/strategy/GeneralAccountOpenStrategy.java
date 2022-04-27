package com.cdns.banking.accountopen.strategy;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.cdns.banking.accountopen.model.AccountRequest;
import com.cdns.banking.accountopen.repository.AccountRequestRepository;

/**
 * GeneralAccountOpenStrategy
 * 
 * @version 1.0
 */
public class GeneralAccountOpenStrategy implements AccountOpenStrategy {

	/**
	 * restTemplate
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * env
	 */
	@Autowired
	private Environment env;

	/**
	 * accountRequestRepository
	 */
	@Autowired
	private AccountRequestRepository accountRequestRepository;

	/**
	 * {@inheritDoc}
	 * 
	 * @throws URISyntaxException
	 * @throws RestClientException
	 */
	@Override
	public String sendOpenAccountRequest(AccountRequest request) throws RestClientException, URISyntaxException {
		// save account open request in t_account_requests
		accountRequestRepository.save(request);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> httpRequest = new HttpEntity<String>(request.toString(), headers);

		return restTemplate.postForObject(new URI(env.getProperty("admin-portal.service.url")), httpRequest,
				String.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountOpenStrategyNames getStrategy() {
		return AccountOpenStrategyNames.GENERAL_ACCOUNT_CREATION_STRATEGY;
	}

}
