package com.zhd.validator.mytestValidator.dto;

public class Respones {

	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static Respones getExeResp(BizException e) {
		Respones respones = new Respones();
		respones.setCode(e.getCode());
		respones.setMsg(e.getMsg());
		return respones;
	}
	public static Respones getExeResp(Exception e) {
		Respones respones = new Respones();
		respones.setCode("1");
		respones.setMsg(e.getMessage());
		return respones;
	}
	public static Respones success() {
		Respones respones = new Respones();
		respones.setCode("0");
		respones.setMsg("成功");
		return respones;
	}

}
