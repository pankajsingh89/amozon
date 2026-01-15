package com.amazon.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestUtil {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void initExtentReport() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    public static void flushExtentReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
