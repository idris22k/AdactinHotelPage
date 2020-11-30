package com.utilityfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		
		File reportDir = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration config = new Configuration(reportDir, "Adactin_Hotel");
		config.addClassifications("OS", "Windows 10");
		config.addClassifications("Driver", "Chrome");
		config.addClassifications("Browser_Version", "85");
		config.addClassifications("Sprint", "10");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder rb = new ReportBuilder(jsonFiles, config);
		rb.generateReports();
	}

}
