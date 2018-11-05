package com.zhd.validator.mytestValidator.validator;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.zhd.validator.mytestValidator.dto.ClientInfoDTO;
import com.zhd.validator.mytestValidator.dto.PurchaseDTO;

/**
 * 表示020，022，039都能用到
 * 
 * @author zhd
 * @version v1.0
 * @date 2018年11月5日 上午11:01:52
 * @work
 */
@Component
@Order(2)
@Scope("prototype")
public class AmountValidator extends PurchaseVaildatorBase implements Buy020Validator, Buy022Validator, Buy039Validator {

	@Override
	public void check(PurchaseDTO purchaseDTO) throws Exception {
		// TODO Auto-generated method stub
		ClientInfoDTO clientInfo = getClientInfo(purchaseDTO);
		System.out.println("AmountValidator:"+new Gson().toJson(clientInfo));
	}

}
