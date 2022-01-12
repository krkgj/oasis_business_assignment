package com.oasisbusiness.assignment.api.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supply")
public class SupplyEntity 
{
	@Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@ManyToOne
	@JoinColumn(name ="contract_company_seq")
	private ContractCompanyEntity contractCompany;
	
	@Column(name = "supply_date")
	private LocalDate supplyDate;
	
	@OneToMany(mappedBy = "supply")
	private List<SupplyBookEntity> supplyBooks = new ArrayList<SupplyBookEntity>();
}
