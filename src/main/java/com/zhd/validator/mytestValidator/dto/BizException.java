package com.zhd.validator.mytestValidator.dto;

public class BizException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String msg;

	public BizException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
