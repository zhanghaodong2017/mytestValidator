package com.zhd.validator.mytestValidator.dto;

import java.math.BigDecimal;

/**
 * 
 * @author zhd
 * @version v1.0
 * @date 2018年11月5日 上午10:47:11
 * @work
 */
public class PurchaseDTO {
	private String businessCode;//业务代码:022申购，020认购，039定投
	private String clientid;//用户id
	private String bankAccount;//使用哪个银行卡购买的
	private String taNo;//基金公司代码
	private String prodCode;//基金代码
	private BigDecimal amount;//买入金额
	
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getTaNo() {
		return taNo;
	}
	public void setTaNo(String taNo) {
		this.taNo = taNo;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
	
}
