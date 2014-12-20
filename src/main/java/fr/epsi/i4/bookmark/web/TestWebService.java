package fr.epsi.i4.bookmark.web;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class TestWebService {

	  public String sayHello(@WebParam(name="who") String name) {
		    return "Hello " + name;
	  }
}
