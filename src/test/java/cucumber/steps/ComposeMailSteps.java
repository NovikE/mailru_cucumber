package cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ComposeEmailDialog;
import pages.DraftsFolderPage;
import utils.InputData;
import utils.StringUtils;

public class ComposeMailSteps {

    String sendToAddress = InputData.SENDTOADRESS.getPersonalData();
    String emailSubject = StringUtils.getRandomString(9);
    String emailBody = StringUtils.getRandomString(50);

    ComposeEmailDialog composeEmailDialog = new ComposeEmailDialog();
    DraftsFolderPage draftsFolder = new DraftsFolderPage();

    @When("I click Compose button")
    public void clickComposeButton() {
        composeEmailDialog.clickCompose();
    }

    @When("I fill all data and save e-mail")
    public void iFillAllDataInEMailForm() {
        composeEmailDialog.createNewDraftEmail(sendToAddress, emailSubject, emailBody);
        composeEmailDialog.closeEmail();
    }

    @When("I open draft folder")
    public void iSaveEMailInDraft() {
        draftsFolder.draftsOpenFolder();
    }

    @Then("there is my e-mail in draft folder")
    public void IsMailInDraftFolder() {
        Assert.assertTrue(draftsFolder.findEmail(emailSubject), "Email is not found in Drafts-folder!");
    }
}
