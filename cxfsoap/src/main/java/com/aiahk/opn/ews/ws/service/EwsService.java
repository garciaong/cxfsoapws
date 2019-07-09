package com.aiahk.opn.ews.ws.service;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service("ewsService")
@WebService(serviceName="EwsService")
@SOAPBinding(style = Style.RPC)
public class EwsService extends SpringBeanAutowiringSupport{

	@PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
	
	@WebMethod(action="http://service.ws.ews.opn.aiahk.com/#checkDocumentexists")
	@WebResult(name="ws_response")
	public WsResponse checkDocumentExists(@WebParam(name="policy_no") String policyNo, @WebParam(name="request_no") String requestNo, 
			@WebParam(name="lob") String lob) {
		return new WsResponse("","","","","");
	}
	
	@WebMethod(action="http://service.ws.ews.opn.aiahk.com/#whatever")
	public String whatever() {
		return "SOAP works!";
	}
	
}
