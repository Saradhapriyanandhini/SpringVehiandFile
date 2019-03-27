package com.infotech.model;

public enum TextEnum {
	ORDERNO(0,20),ORDERNAME(21,40),USERNAME(41,60),MOBILENO(61,80),PLACE(81,100);
	 
    // constructor
    private TextEnum(final int start,final int end) {
        this.start = start;
        this.end = end;
    }
 
    // internal state
    private int start;
    private int end;
 
    public int getStart()
    {
    	return start;
    }
    
    public int getEnd()
    {
    	return end;
    }
    
}
