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

WebUI.navigateToUrl('http://192.168.0.102/lafleur2011/')

'Vérification de la présence du message d\'accueil du site.'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Lafleur 20111/div_Lafleur le prince des fleu (1)'), 'Lafleur, le prince des fleurs sur internet')

'Accès au catalogue via clic sur le menu'
WebUI.click(findTestObject('Object Repository/Page_Lafleur 20111/a_Voir le catalogue de fleurs (1)'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Commande/Page_Lafleur 20111/li_Plantes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Commande/Page_Lafleur 20111/li_Composition'))

WebUI.verifyElementText(findTestObject('Commande/Page_Lafleur 20111/li_Fleurs'), 'Fleurs')

WebUI.click(findTestObject('Commande/Page_Lafleur 20111/li_Fleurs'))

WebUI.click(findTestObject('Commande/Page_Lafleur 20111/img_mayotte'))

WebUI.click(findTestObject('Object Repository/Page_Lafleur 20111/img'))

WebUI.click(findTestObject('Object Repository/Page_Lafleur 20111/a_Voir son panier'))

WebUI.click(findTestObject('Object Repository/Page_Lafleur 20111/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_Lafleur 20111/input_Nom Prnom_nom'), 'ROBERT Jean')

WebUI.setText(findTestObject('Object Repository/Page_Lafleur 20111/input_rue_rue'), 'Rue du four')

WebUI.setText(findTestObject('Object Repository/Page_Lafleur 20111/input_code postal_cp'), '55000')

WebUI.setText(findTestObject('Object Repository/Page_Lafleur 20111/input_ville_ville'), 'PARIS')

WebUI.click(findTestObject('Object Repository/Page_Lafleur 20111/input_mail_valider'))

WebUI.verifyElementVisible(findTestObject('Commande/Page_Lafleur 20111/li_Il faut saisir le champ mai'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Commande/Page_Lafleur 20111/input_mail_mail'), 'roberjean@gmail.com')

WebUI.click(findTestObject('Commande/Page_Lafleur 20111/input_mail_valider'))

WebUI.verifyElementPresent(findTestObject('Commande/Page_Lafleur 20111/li_Commande enregistre'), 0)

