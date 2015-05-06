package service;

import javax.jws.WebService;

@WebService
public class HelloService {
	public String sayHello(String name){
		return "Hello,my name is "+name;
	}
}
