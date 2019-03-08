package aseftian.springbiz.controller;

import java.io.Serializable;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import aseftian.springbiz.domain.Product;

@RestController
@RequestMapping(name = "product")
public class ProductController implements Serializable {

	private static final long serialVersionUID = 1499653633832508894L;

	@RequestMapping(value = "/show", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@SuppressWarnings("rawtypes")
	public ResponseEntity showAll() {
		return ResponseEntity.ok("product showed");
	}

	@RequestMapping(value = "/find/{productId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@SuppressWarnings("rawtypes")
	public ResponseEntity findById(@PathVariable String productId) {
		return ResponseEntity.ok("product founded");
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@SuppressWarnings("rawtypes")
	public ResponseEntity add(@RequestBody Product product) {
		return ResponseEntity.ok("product added");
	}

	@RequestMapping(value = "/update/{productId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@SuppressWarnings("rawtypes")
	public ResponseEntity update(@PathVariable String productId, @RequestBody Product product) {
		return ResponseEntity.ok("product updated");
	}

	@RequestMapping(value = "/delete/{productId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@SuppressWarnings("rawtypes")
	public ResponseEntity delete(@PathVariable String productId) {
		return ResponseEntity.ok("product deleted");
	}
}
