
package mashreqBankTest.StepDef;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import mashreqBankTest.utilities.CommonUtilities;
import mashreqBankTest.utilities.ExtentReportingUtil;


public class Hooks extends CommonUtilities{
	public static String scenarioName;
	
	
	@Before
	public void getScenarioName(Scenario scenario)
	{
		scenarioName=scenario.getName();
		ExtentReportingUtil.createExtentTest(scenarioName);
	}
	
	@After
	public void flushReport()
	{
		ExtentReportingUtil.extentflush();
	}

	
}
