package com.infosys.customerservice.customerserviceapp.repository;


import com.infosys.customerservice.customerserviceapp.entity.Customer;

import io.micronaut.data.annotation.*;
import io.micronaut.data.repository.CrudRepository;


@Repository
public
interface CustomerRepository extends CrudRepository<Customer, Long>  {



}
