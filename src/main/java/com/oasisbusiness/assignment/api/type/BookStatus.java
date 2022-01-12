package com.oasisbusiness.assignment.api.type;

public enum BookStatus 
{	
	알수없음("알수없음", 0),
	입고중("입고중", 1),
	판매중("판매중", 2),
	품절("품절", 3),
	절판("절판", 4);

	private final String status;
	private final Integer seq;
	
	BookStatus(String status, int seq) 
	{
		this.status = status;
		this.seq = seq;
	}
	
	public static BookStatus findBySeq(int seq)
	{
		for (BookStatus value : values()) 
		{
			if(value.seq == seq)
			{
				return value;
			}
		}
		return 알수없음;
	}
	
	public static BookStatus findByStatus(String status)
	{
		for (BookStatus value : values()) 
		{
			if(value.status == status)
			{
				return value;
			}
		}
		return 알수없음;
	}

}
