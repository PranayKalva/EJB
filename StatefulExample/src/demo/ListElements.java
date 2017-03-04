package demo;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

@Stateful
public class ListElements implements RemoteInterface {
	List<Integer> values = new ArrayList<>();
	public ListElements(){
		values.add(2);
	}
	@Override
	public void addElement(int i) {
		values.add(i);
	}

	@Override
	public void removeElement(int i) {
		// TODO Auto-generated method stub
		values.remove(new Integer(i));
	}
	public void method(){
		System.out.println("Hie");
	}

	@Override
	public List<Integer> getElement() {
		return values;
	}
	
}
