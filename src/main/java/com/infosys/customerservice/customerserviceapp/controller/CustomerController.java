/**
 * 
 */
package com.infosys.customerservice.customerserviceapp.controller;



import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.infosys.customerservice.customerserviceapp.entity.Customer;
import com.infosys.customerservice.customerserviceapp.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.micronaut.http.MediaType;

@Controller("/customer/v1")
public class CustomerController {

    @Inject
    CustomerRepository customerRepository;

   @Get("/ping")
    String ping() {
        return "Success";
    }
   	
	
	  @Transactional
	  
	  @Get("/setobject") String create() {
	  
	  Customer customer = new Customer(); customer.setName("Manisha");
	  
	  customer.setAddress("Bangalore"); //customer.setId(1);
	  customer.setMobile("8861203133");
	  
	  
	  customer.setVehicles("Scooty"); Customer val =
	  customerRepository.save(customer); return "succefully created"; }
	 
   
   @Transactional 
   @Get("/all")
   
  String all() {

       Optional<Customer> cust = customerRepository.findById(1L);
       return cust.toString();
   }

    /*@Get("/hello")
    public String index() {
        return "Success";
    }

    @Patch("/{id}/address")
    public String updateAddress(@PathVariable(value = "id") Long id, @Body String address) {
        address = "Bangalore";
        return address;
    }

    @Patch("/{customerId}/vehicle/{vehicleId}")
    public String updateVehicle(  @PathVariable(value = "customerId") Long customerId,
                                      @PathVariable(value = "vehicleId") Long vehicleId, @Body String vehicle) {
        vehicle = "twowheeler";
        return vehicle;
    }*/
}