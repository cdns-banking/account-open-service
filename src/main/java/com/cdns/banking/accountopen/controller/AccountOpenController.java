package com.cdns.banking.accountopen.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.cdns.banking.accountopen.model.AccountRequest;
import com.cdns.banking.accountopen.service.AccountOpenService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/accountopen")
public class AccountOpenController {

	@Autowired
	AccountOpenService accountOpenService;

	@PostMapping("/request")
	public String openAccount(@RequestBody AccountRequest accountRequest) {
		String result = "";
		try {
			if ("open".equals(accountRequest.getAccountType())) {
				result = accountOpenService.sendAccountOpenRequest(accountRequest);
			} else {
				result = accountOpenService.validateAccountRequest(accountRequest);
			}

		} catch (JsonProcessingException | RestClientException | URISyntaxException e) {

		}
		return result;
	}

	@DeleteMapping("/request/{accountNumber}")
	public String closeAccount(@PathVariable String accountNumber) {
		return accountOpenService.sendAccountCloseRequest(accountNumber);
	}

}
