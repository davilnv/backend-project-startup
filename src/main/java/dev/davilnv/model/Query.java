package dev.davilnv.model;

public class Query {

	public static final String GET_ALL_STARTUP = "select * from " + TableInfo.STARTUP_TABLE;
	public static final String GET_STARTUP_CATEGORY_BY_ID = "select cat." +
			TableInfo.CATEGORY_ID + ", cat." + TableInfo.CATEGORY_DESCRIPTION + 
			" from " + 
			TableInfo.CATEGORY_TABLE + " cat , " +
			TableInfo.STARTUP_CATEGORY_TABLE + " stpcat " + 
			"where cat." + 
			TableInfo.CATEGORY_ID + " = stpcat." + 
			TableInfo.CATEGORY_ID + " and " + TableInfo.STARTUP_ID + " = ";
}
