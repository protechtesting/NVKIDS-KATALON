import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.50.120.22:81/nvkids/#/tools/maintanance/parm/view')

WebUI.click(findTestObject('PARM/PARMSearch/ExpandFilter'))

WebUI.click(findTestObject('PARM/PARMSearch/ClickJobLOV'))

WebUI.setText(findTestObject('PARM/PARMSearch/TypeJOB'), 'nvb0014')

WebUI.click(findTestObject('PARM/PARMSearch/ClickSeachJOBLOV'))

WebUI.delay(2)

WebUI.click(findTestObject('PARM/PARMSearch/ClickData'))

WebUI.click(findTestObject('PARM/PARMSearch/ClickOkLOV'))

WebUI.click(findTestObject('PARM/PARMSearch/FilterSearch'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('PARM/PARMSearch/SearchResult'), 'NVB0014')

