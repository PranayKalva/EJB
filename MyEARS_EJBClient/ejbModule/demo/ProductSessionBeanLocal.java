package demo;

import java.util.List;

import javax.ejb.Local;

import entity.Product;

@Local
public interface ProductSessionBeanLocal {
	public List<Product> findAll();
	public Product addProduct();
}
