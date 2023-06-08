package com.Argano.utlis;
 

import java.util.Objects;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import com.Argano.constants.FrameworkConstants;
import com.Argano.enums.ConfigProperties; 

public final class SendEmailReportUtlis {

	private SendEmailReportUtlis() {

	}

	static // auth credentials
	String from = "venkatesh.orusu@argano.com";
	static String authKey = "nqjvbxfgpadprrwx";
	// email body
	static String subject = "Test Execution Status Report";
	static String[] toAddress = {"venkatesh8008036296@gmail.com"};//getListOfReceipient("TOEMAILRECIPIENT");
	static String message = "Hi Team,\n\n Find the Attached test Automation Execution Report \n\n";
	static String ReportPath = FrameworkConstants.getEXTENTREPORTFILEPATH();

	public static void sendEmailWithResults() {
		if (PropertyUtils.get(ConfigProperties.SENDRESULTINMAIL).equalsIgnoreCase("yes")) {

			EmailsHandler email = new EmailsHandler();
			email.setProperties();
			email.auth(from, authKey);
			email.setUpEmail(from, toAddress, subject);
			email.addMessage(message);
			email.addHtml(FileReaderUtils.readFromFile(ReportPath));
			email.addAttachment(ReportPath);
			email.send();

			System.out.println("Email sent Successfully");
		}
	}

	/*
	public static void sendEmailWithResults1() throws EmailException {
		if (PropertyUtils.get(ConfigProperties.SENDRESULTINMAIL).equalsIgnoreCase("yes")) {
			ReportPath = FrameworkConstants.getEXTENTREPORTFILEPATH();
			MultiPartEmail email = new MultiPartEmail();

			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath(ReportPath);
			attachment.setDisposition(EmailAttachment.ATTACHMENT);
			attachment.setDescription("Execution Results");
			attachment.setName("Status Report.html");
			try {
				email.attach(attachment);
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator(FrameworkConstants.getReportsendingemailid(),
					FrameworkConstants.getReportsendingpswd()));
			email.setSSLOnConnect(true);
			email.setStartTLSEnabled(true);
			email.setFrom(FrameworkConstants.getReportsendingemailid());
			email.setSubject("Test Execution Status Report");
			email.setMsg("Hi Team,\n\n Find the Attached test Automation Execution Report \n\n");
			email.addTo(getListOfReceipient("TOEMAILRECIPIENT"));
			if (Objects.nonNull(getListOfReceipient("CCEMAILRECIPIENT"))) {
				email.addCc(getListOfReceipient("CCEMAILRECIPIENT"));
			}
			if (Objects.nonNull(getListOfReceipient("BCCEMAILRECIPIENT"))) {
				email.addBcc(getListOfReceipient("BCCEMAILRECIPIENT"));
			}
			email.send();

		}
	}

	//  Used to separate email list from the TestRunDetails.properties based on
	// comma and return them as a String array.
	public static String[] getListOfReceipient(String maillist) {
		String[] toList = null;
		if (maillist.equalsIgnoreCase("TOEMAILRECIPIENT")) {
			if (PropertyUtils.get(ConfigProperties.TOEMAILRECIPIENT).equalsIgnoreCase("null")) {
				throw new TOEMAILNULLVALUEEXCEPTION(
						"To email for sending reports should not be null. CHeck TOEMAILRECIPIENT value inconfig.properties file");
			} else {
				toList = PropertyUtils.get(ConfigProperties.TOEMAILRECIPIENT).split(",");
			}
		} else if (maillist.equalsIgnoreCase("BCCEMAILRECIPIENT")) {
			if (!PropertyUtils.get(ConfigProperties.BCCEMAILRECIPIENT).equalsIgnoreCase("null")) {
				toList = PropertyUtils.get(ConfigProperties.BCCEMAILRECIPIENT).split(",");
			}
		} else if (maillist.equalsIgnoreCase("CCEMAILRECIPIENT")) {

			if (!PropertyUtils.get(ConfigProperties.CCEMAILRECIPIENT).equalsIgnoreCase("null")) {
				toList = PropertyUtils.get(ConfigProperties.CCEMAILRECIPIENT).split(",");
			}
		}
		return toList;
	}
	*/
}
