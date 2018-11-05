package com.zhd.validator.mytestValidator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.zhd.validator.mytestValidator.dto.PurchaseDTO;
import com.zhd.validator.mytestValidator.dto.Respones;
import com.zhd.validator.mytestValidator.service.BuyService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class AppTest {

	@Autowired
	private BuyService buyService;

	@Test
	public void fun1() {
		try {
			PurchaseDTO purchaseDTO = new PurchaseDTO();
			purchaseDTO.setBusinessCode("020");
			purchaseDTO.setBankAccount("12312312");
			purchaseDTO.setClientid("1234567890");
			Respones respones = buyService.purchase(purchaseDTO);
			System.out.println(new Gson().toJson(respones));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
