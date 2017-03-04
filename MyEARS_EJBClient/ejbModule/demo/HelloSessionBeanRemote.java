package demo;

import javax.ejb.Remote;

@Remote
public interface HelloSessionBeanRemote {
	public String helloWorld();
	public String hi(String fullName);
}
