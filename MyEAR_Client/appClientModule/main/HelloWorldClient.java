package main;

import javax.naming.InitialContext;

import demo.ProductSessionBeanRemote;
import util.Init;
import entity.Product;

public class HelloWorldClient {
	public Product getProduct(){
		try{
			InitialContext ic = Init.getInit();
			ProductSessionBeanRemote productSessionBean = (ProductSessionBeanRemote) ic.lookup("demo.ProductSessionBeanRemote");
			return productSessionBean.addProduct();
		}
		catch(Exception e){
			return null;
		}
	}
}
