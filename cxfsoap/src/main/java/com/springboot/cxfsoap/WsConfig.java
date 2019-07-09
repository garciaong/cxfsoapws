package com.springboot.cxfsoap;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aiahk.opn.ews.ws.service.EwsService;

@Configuration
public class WsConfig {

	@Autowired
    private Bus bus;
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new EwsService());
        endpoint.publish("/EwsService");
        return endpoint;
    }
    
}
