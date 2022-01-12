package com.oasisbusiness.assignment.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto 
{
	@ApiModelProperty(example = "결과 코드")
	private String code;
	
	@ApiModelProperty(example = "결과 메세지")
	private String message;

	@ApiModelProperty(example = "특정한 오브젝트 (ex) List<SupplyBookDto> ....")
	private Object result;
	
	public ResultDto(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
