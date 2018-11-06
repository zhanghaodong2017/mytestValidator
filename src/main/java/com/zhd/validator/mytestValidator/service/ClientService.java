package com.zhd.validator.mytestValidator.service;

import com.zhd.validator.mytestValidator.dto.ClientInfoDTO;

public interface ClientService {

	public ClientInfoDTO queryClientById(String clientId);
}
