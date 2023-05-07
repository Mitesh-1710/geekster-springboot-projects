package com.geekster.employee.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.employee.management.system.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
