package com.zhd.validator.mytestValidator.validator;

import com.zhd.validator.mytestValidator.dto.PurchaseDTO;

@SuppressWarnings("hiding")
public interface Validator<T extends PurchaseDTO> {

	public void check(T t) throws Exception;

}
