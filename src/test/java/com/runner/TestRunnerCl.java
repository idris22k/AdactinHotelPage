package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilityfile.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"com.stepdefenition" }, monochrome = true, snippets = SnippetType.CAMELCASE, strict = true, plugin = { "pretty",
				"json:src\\test\\resources\\Reports\\cucumber.json" })
public class TestRunnerCl {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\cucumber.json");
	}
}
