package com.oasisbusiness.assignment.api.type;

public enum ContractStatusCode 
{
	UNKNOWN("UNKNOWN", 0),
	APPROVAL("APPROVAL", 1), 
	WAITING("WAITING", 2),
	HOLDING("HOLDING", 3),
	CANCEL("CANCEL", 4);
	
	private final String status;
	private final Integer seq;

	ContractStatusCode(String status, int seq) 
	{
		this.status = status;
		this.seq = seq;
	}
	
	public static ContractStatusCode findBySeq(int seq)
	{
		for (ContractStatusCode value : values()) 
		{
			if(value.seq == seq)
			{
				return value;
			}
		}
		return UNKNOWN;
	}
	
	public static ContractStatusCode findByStatus(String type)
	{
		for (ContractStatusCode value : values()) 
		{
			if(value.status == type)
			{
				return value;
			}
		}
		return UNKNOWN;
	}

}
