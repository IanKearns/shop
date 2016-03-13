package shop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public void save(Product emp) {
		productRepository.save(emp);
	}

	public void remove(Product emp) {
		productRepository.delete(emp);
	}

}
