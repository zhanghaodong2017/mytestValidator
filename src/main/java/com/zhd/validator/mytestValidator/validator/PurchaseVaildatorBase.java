package com.zhd.validator.mytestValidator.validator;

import org.springframework.stereotype.Component;

import com.zhd.validator.mytestValidator.dto.ClientInfoDTO;
import com.zhd.validator.mytestValidator.dto.PurchaseDTO;

@Component
public class PurchaseVaildatorBase {

	private ClientInfoDTO clientInfoDTO;

	protected ClientInfoDTO getClientInfo(PurchaseDTO purchaseDTO) {
		if (clientInfoDTO != null) {
			return clientInfoDTO;
		}
		// TODO 根据clientid获取ClientInfoDTO
		String clientid = purchaseDTO.getClientid();
		clientInfoDTO = queryClientById(clientid);
		return clientInfoDTO;
	}

	private ClientInfoDTO queryClientById(String clientid) {
		// TODO
		ClientInfoDTO clientInfoDTO = new ClientInfoDTO();
		clientInfoDTO.setClientId(clientid);
		clientInfoDTO.setClientName("张三");
		System.out.println("ClientInfoDTO被实例化");
		return clientInfoDTO;
	}

}
