import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.helpstoptheviruspro.com/')

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/a_Continue to site'))

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/a_dropdown-toggle icon-main-na'))

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/a_STRATEGIES'))

WebUI.click(findTestObject('Menu options/Page_HIV Baseline Evaluations  Help/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_HIV Baseline Evaluations  Help/a_dropdown-toggle icon-main-na'))

WebUI.click(findTestObject('Menu options/Page_HIV Baseline Evaluations  Help/a_TREATMENT'))

WebUI.waitForElementClickable(findTestObject('Menu options/Page_1524849996767/logo header'), 10)

WebUI.click(findTestObject('Menu options/Page_1524849996767/logo header'))

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/button_btn-menu-text'))

WebUI.waitForElementClickable(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/Page_Adherence To HIV Treatment  He/a_dropdown-toggle icon-main-na'), 
    10)

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/Page_Adherence To HIV Treatment  He/a_dropdown-toggle icon-main-na'))

WebUI.click(findTestObject('Menu options/Page_Help Stop The Virus Pro An HIV/Page_Adherence To HIV Treatment  He/a_ADHERENCE_1'))

WebUI.click(findTestObject('Menu options/Page_Adherence To HIV Treatment  He/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_Adherence To HIV Treatment  He/a_dropdown-toggle icon-main-na'))

WebUI.click(findTestObject('Menu options/Page_Adherence To HIV Treatment  He/a_LIFESTYLE'))

WebUI.click(findTestObject('Menu options/Page_Living Healthier with HIV  Hel/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_Living Healthier with HIV  Hel/a_dropdown-toggle icon-main-na'))

WebUI.click(findTestObject('Menu options/Page_Living Healthier with HIV  Hel/a_LIBRARY'))

WebUI.click(findTestObject('Menu options/Page_Living Healthier with HIV  Hel/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_HIV Specialist Perspectives  H/a_REGISTER FOR UPDATES'))

WebUI.click(findTestObject('Menu options/Page_Register for Updates  Help Sto/Page_Register for Updates  Help Sto/button_btn-menu-text'))

WebUI.click(findTestObject('Menu options/Page_Register for Updates  Help Sto/Page_Register for Updates  Help Sto/a_HOME'))

