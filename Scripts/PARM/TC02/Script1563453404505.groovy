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

WebUI.navigateToUrl('http://10.50.120.22:81/nvkids/#/tools/maintanance/parm/view')

WebUI.click(findTestObject('Object Repository/Page_Nvkids/span_Manage Batch Parameters'))

WebUI.click(findTestObject('Object Repository/Page_Nvkids/span_Filter_fa fa-angle-double-down downIcon'))

WebUI.click(findTestObject('Object Repository/Page_Nvkids/span_Job ID_ui-button-icon-left ui-clickable fa fa-search'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Nvkids/span_NVB0014'))

WebUI.click(findTestObject('Object Repository/Page_Nvkids/span_Search'))

WebUI.closeBrowser()

