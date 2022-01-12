package com.oasisbusiness.assignment.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "contract_company")
public class ContractCompanyEntity 
{
	/**
	 * 계약 번호
	 */
	@Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    /**
     * 계약 날짜
     */
    @Column(name = "cntrc_date")
    private LocalDate cntrcDate;

    /**
     * 최저가 비울
     */
    @Column(name = "lwst_rate")
    private BigDecimal lwstRate;

    /**
     * 계약 상태 코드
     */
    @Column(name = "status_code")
    private String statusCode;

	@OneToMany(mappedBy = "contractCompany")
	private List<SupplyEntity> supplys = new ArrayList<SupplyEntity>();
}
