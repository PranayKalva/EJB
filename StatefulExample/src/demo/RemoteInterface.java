package demo;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface RemoteInterface {
	void addElement(int i);
	void removeElement(int i);
	void method();
	List<Integer> getElement();
}
