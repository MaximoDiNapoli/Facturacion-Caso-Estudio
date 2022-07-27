package com.example.purchase.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import request.ProductRequest;

import javax.validation.Valid;
import java.util.List;
/**
 * @author jrodriguez
 */
@FeignClient(name = "products-microservice")
public interface ProductClient {

     @RequestMapping(value = "/products/calcTotal", method = RequestMethod.POST)
     ResponseEntity<Double> calcTotal(@Valid @RequestBody List<ProductRequest> productRequestList);
}
