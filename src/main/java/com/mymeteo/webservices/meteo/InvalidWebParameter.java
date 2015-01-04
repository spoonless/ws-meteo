package com.mymeteo.webservices.meteo;

import javax.xml.ws.WebFault;

@WebFault(targetNamespace="http://www.mymeteo.com/meteo", messageName="invalidParameter")
public class InvalidWebParameter extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidWebParameter() {
	}

	public InvalidWebParameter(String message) {
		super(message);
	}

}
