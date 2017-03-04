package demo;

import javax.ejb.Local;

@Local
public interface HelloSessionBeanLocal {
	public String helloWorld();
	public String hi(String fullName);
}
