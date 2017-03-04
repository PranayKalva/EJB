package demo;

import main.HelloWorldClient;
public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				
				HelloWorldClient hc = new HelloWorldClient();
			 	System.out.println(hc.getProduct().getName());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
	}

}
