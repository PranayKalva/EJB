package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entity.Product;

import java.util.*;


@Stateless
@LocalBean
public class ProductSessionBean implements ProductSessionBeanRemote, ProductSessionBeanLocal {
   public ProductSessionBean() {
       
    }
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product("1", "Mango", 250));
		products.add(new Product("2", "Apple", 350));
		products.add(new Product("3", "Banana",150));
		return products;
	}
	@Override
	public Product addProduct() {
		// TODO Auto-generated method stub
		return new Product("1", "Apple", 350);
	}
}
