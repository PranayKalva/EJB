package entity;

import java.io.Serializable;
	public class Product implements Serializable {
	
		private static final long serialVersionUID = 1L;
		private String id;
		private String name;
		private long price;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		public Product(String id, String name, long price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
		public Product() {
		}
		
	}



