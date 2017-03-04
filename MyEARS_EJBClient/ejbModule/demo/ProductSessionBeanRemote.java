package demo;

import java.util.List;

import javax.ejb.Remote;

import entity.Product;

@Remote
public interface ProductSessionBeanRemote {
	public List<Product> findAll();
	public Product addProduct();

}
