package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@Autowired
	private ProductRepository productRepository;
	
	@JmsListener(destination = "DEV.QUEUE.1", containerFactory = "myFactory")
	public void receiveMessage(Product product) {
		System.out.println("Received <" + product + ">");
		productRepository.save(product);
	}
}
