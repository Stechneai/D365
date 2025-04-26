package com.d365.core;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class SchemeMaturityReport extends MasterClass{
	

	public String fromdate;
	public String todate;
	public String schemetype;
	public String store;

	public void add(MasterDto masterDto)
			throws IOException, InterruptedException, InvalidFormatException, ParseException, AWTException {

		fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("From Date"), "");

		todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("To Date"), "");
		schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scheme Type"), "");
		store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
	
	
	}
}
