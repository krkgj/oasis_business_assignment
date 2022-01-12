package com.oasisbusiness.assignment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasisbusiness.assignment.api.entity.ContractCompanyEntity;

@Repository
public interface ContractCompanyRepository extends JpaRepository<ContractCompanyEntity, Long>
{

}
