package com.hadoop.buc;

public class InventoryReader implements InputReader{
	String[] sources;
	
	@Override
	public void initWithString(String input) {
		sources = input.split("\t");
		
	}

	@Override
	public String getValueByAttributeName(String name) {
		
		if (name.equals("A"))
			return sources[0];
		if (name.equals("B"))
			return sources[1];
		if (name.equals("C"))
			return sources[2];
		if (name.equals("D"))
			return sources[3];
                if (name.equals("Q"))
			return sources[4];
		
		return null;
	}

}
