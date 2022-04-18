package com.cdns.banking.accountopen.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdns.banking.accountopen.model.AccountRequest;

/**
 * AccountRequestRepository
 * @version 1.0
 */
public interface AccountRequestRepository extends CrudRepository<AccountRequest, String> {

}
