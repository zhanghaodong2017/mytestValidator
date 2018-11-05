package com.zhd.validator.mytestValidator.validator;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zhd.validator.mytestValidator.dto.PurchaseDTO;

/**
 * 表示020，039都能用到
 * 
 * @author zhd
 * @version v1.0
 * @date 2018年11月5日 上午11:01:52
 * @work
 */
@Component
@Order(1)
@Scope("prototype")
public class BanckCardValidator extends PurchaseVaildatorBase implements Buy020Validator, Buy039Validator {

	@Override
	public void check(PurchaseDTO purchaseDTO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BanckCardValidator");
	}

}
