package com.zhd.validator.mytestValidator.service;

import com.zhd.validator.mytestValidator.dto.PurchaseDTO;
import com.zhd.validator.mytestValidator.dto.Respones;

public interface BuyService {
	
	public Respones purchase(PurchaseDTO purchaseDTO);
}
