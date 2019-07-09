package com.aiahk.opn.ews.ws.service;

import java.io.Serializable;

public class WsResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2392217197593902587L;
	String statusCode;
	String xlsOid;
	String htmOid;
	String message;
	String ewsUrl;
	
	public WsResponse(String statusCode, String xlsOid, String htmOid, String message, String ewsUrl) {
		this.statusCode = statusCode;
		this.xlsOid = xlsOid;
		this.htmOid = htmOid;
		this.message = message;
		this.ewsUrl = ewsUrl;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getXlsOid() {
		return xlsOid;
	}
	public void setXlsOid(String xlsOid) {
		this.xlsOid = xlsOid;
	}
	public String getHtmOid() {
		return htmOid;
	}
	public void setHtmOid(String htmOid) {
		this.htmOid = htmOid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEwsUrl() {
		return ewsUrl;
	}
	public void setEwsUrl(String ewsUrl) {
		this.ewsUrl = ewsUrl;
	}
	
}
