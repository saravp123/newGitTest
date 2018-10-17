package hello;

import javax.validation.Valid;

public interface ProductService {
	Product save(@Valid Product product);
}
