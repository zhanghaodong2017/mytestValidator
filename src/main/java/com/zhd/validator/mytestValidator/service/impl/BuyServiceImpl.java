package com.zhd.validator.mytestValidator.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.zhd.validator.mytestValidator.dto.BizException;
import com.zhd.validator.mytestValidator.dto.PurchaseDTO;
import com.zhd.validator.mytestValidator.dto.Respones;
import com.zhd.validator.mytestValidator.service.BuyService;
import com.zhd.validator.mytestValidator.validator.Buy020Validator;
import com.zhd.validator.mytestValidator.validator.Buy022Validator;
import com.zhd.validator.mytestValidator.validator.Buy039Validator;
import com.zhd.validator.mytestValidator.validator.SpringCtxUtil;
import com.zhd.validator.mytestValidator.validator.Validator;

@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	private SpringCtxUtil springCtxUtil;

	@Override
	public Respones purchase(PurchaseDTO purchaseDTO) {
		try {
			// TODO 校验参数合法性
			checkParams(purchaseDTO);
			// TODO 业务校验
			validator(purchaseDTO);

		} catch (BizException e) {
			return Respones.getExeResp(e);
		} catch (Exception e) {
			e.printStackTrace();
			return Respones.getExeResp(e);
		}
		return Respones.success();
	}

	private List<Validator> getValidator(String businessCode) {
		if ("020".equals(businessCode)) {
			Map<String, Buy020Validator> beans = springCtxUtil.getBeans(Buy020Validator.class);
			return new ArrayList<>(beans.values());
		}
		if ("022".equals(businessCode)) {
			Map<String, Buy022Validator> beans = springCtxUtil.getBeans(Buy022Validator.class);
			return new ArrayList<>(beans.values());
		}
		if ("039".equals(businessCode)) {
			Map<String, Buy039Validator> beans = springCtxUtil.getBeans(Buy039Validator.class);
			return new ArrayList<>(beans.values());
		}
		return null;
	}

	private void checkParams(PurchaseDTO purchaseDTO) throws BizException {

	}

	private void validator(PurchaseDTO purchaseDTO) throws Exception {
		List<Validator> validators = getValidator(purchaseDTO.getBusinessCode());
		Collections.sort(validators, new MyCompareor());
		for (Validator validator : validators) {
			validator.check(purchaseDTO);
		}
	}

}

class MyCompareor implements Comparator<Validator> {

	@Override
	public int compare(Validator o1, Validator o2) {
		int order1 = getOrder(o1);
		int order2 = getOrder(o2);
		return order1 - order2;
	}

	private int getOrder(Validator validator) {
		Order order = validator.getClass().getAnnotation(Order.class);
		if (order != null) {
			return order.value();
		}
		return 0;
	}

}