package com.oasisbusiness.assignment.api.type;

public enum BookCategory 
{
	알수없음("알수없음", 0),
	소설("소설", 6),
	수필("수필", 6),
	과학("과학", 6),
	동화("동화", 6),
	경제("경제", 6),
	역사("역사", 6);

	private final String category;
	private final Integer seq;
	
	BookCategory(String category, int seq) 
	{
		this.category = category;
		this.seq = seq;
	}
	
	public static BookCategory findBySeq(int seq)
	{
		for (BookCategory value : values()) 
		{
			if(value.seq == seq)
			{
				return value;
			}
		}
		return 알수없음;
	}
	
	public static BookCategory findByCategory(String type)
	{
		for (BookCategory value : values()) 
		{
			if(value.category == type)
			{
				return value;
			}
		}
		return 알수없음;
	}

}
