package com.zhd.validator.mytestValidator.service.impl;

import org.springframework.stereotype.Service;

import com.zhd.validator.mytestValidator.dto.ClientInfoDTO;
import com.zhd.validator.mytestValidator.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public ClientInfoDTO queryClientById(String clientId) {
		ClientInfoDTO clientInfoDTO = new ClientInfoDTO();
		clientInfoDTO.setClientId(clientId);
		clientInfoDTO.setClientName("张三");
		System.out.println("ClientInfoDTO被实例化");
		return clientInfoDTO;
	}

}
