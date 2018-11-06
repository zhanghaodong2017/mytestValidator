package com.zhd.validator.mytestValidator.validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhd.validator.mytestValidator.dto.ClientInfoDTO;
import com.zhd.validator.mytestValidator.dto.PurchaseDTO;
import com.zhd.validator.mytestValidator.service.ClientService;

public abstract class PurchaseVaildatorBase {

	@Autowired
	protected ClientService clientService;

	private ClientInfoDTO clientInfoDTO;

	protected ClientInfoDTO getClientInfo(PurchaseDTO purchaseDTO) {
		if (clientInfoDTO != null) {
			return clientInfoDTO;
		}
		// TODO 根据clientid获取ClientInfoDTO
		String clientid = purchaseDTO.getClientid();
		clientInfoDTO = clientService.queryClientById(clientid);
		return clientInfoDTO;
	}

}
