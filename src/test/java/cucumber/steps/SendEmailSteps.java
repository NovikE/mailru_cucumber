package cucumber.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ComposeEmailDialog;
import pages.DraftsFolderPage;
import pages.SentEmailsFolderPage;
import utils.StringUtils;

public class SendEmailSteps {

    String emailBody = StringUtils.getRandomString(50);

    ComposeEmailDialog composeEmailDialog = new ComposeEmailDialog();
    DraftsFolderPage draftsFolder = new DraftsFolderPage();
    SentEmailsFolderPage sentEmailsFolder = new SentEmailsFolderPage();

    @When("I fill Send to address {string} and subject {string} and save e-mail in draft")
    public void createEMailInDraft(String sendToAddress, String emailSubject) {
        composeEmailDialog.createNewDraftEmail(sendToAddress, emailSubject, emailBody);
        composeEmailDialog.closeEmail();

    }

    @When("I find the e-mail and send with Send to address {string} and subject {string}")
    public void findMailinDraft(String sendToAddress, String emailSubject) {

        draftsFolder.draftsOpenFolder();
        draftsFolder.findEmail(emailSubject);
        draftsFolder.verifyEmails(sendToAddress, emailBody);
        draftsFolder.sendEmail();
        draftsFolder.closeAlertWindow();

    }

    @Then("There is email in Sent folder with subject {string}")
    public void thereIsEmailInSentFolder(String emailSubject) throws InterruptedException {
        Assert.assertTrue(sentEmailsFolder.openSentEmailsFolder().isEmailSent(emailSubject),"Email is not sent!");
        sentEmailsFolder.logout();
    }
}
