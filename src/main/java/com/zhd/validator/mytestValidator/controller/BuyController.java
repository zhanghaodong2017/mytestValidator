package com.zhd.validator.mytestValidator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhd.validator.mytestValidator.dto.PurchaseDTO;
import com.zhd.validator.mytestValidator.dto.Respones;
import com.zhd.validator.mytestValidator.service.BuyService;

/**
 * 
 * @author zhd
 * @version v1.0
 * @date 2018年11月5日 上午10:53:05
 * @work
 */
@RestController
public class BuyController {

	@Autowired
	private BuyService buyService;

	/**
	 * 
	 * @param purchaseDTO
	 * @return
	 */
	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
	public Respones purchase(PurchaseDTO purchaseDTO) {
		return buyService.purchase(purchaseDTO);
	}
}
