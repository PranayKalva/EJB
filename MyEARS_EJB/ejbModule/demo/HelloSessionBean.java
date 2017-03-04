package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloSessionBean
 */
@Stateless
@LocalBean
public class HelloSessionBean implements HelloSessionBeanRemote, HelloSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	@Override
	public String hi(String fullName) {
		// TODO Auto-generated method stub
		return "Hi "+fullName;
	}

}
