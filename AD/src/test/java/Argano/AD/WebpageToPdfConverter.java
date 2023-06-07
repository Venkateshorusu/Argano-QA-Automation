package Argano.AD;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.pdf.parser.clipper.Paths;

import Utilities.Driver;


public class WebpageToPdfConverter {
    public static void main(String[] args) throws Exception {
        // Set up WebDriver and open the webpage
    	Driver.getDriver("chrome");
		Driver.driver.get("https://www.w3schools.com/");

		byte[] imageBytes = ((FirefoxDriver)Driver.driver).getFullPageScreenshotAs(OutputType.BYTES);
//		Files.write(Paths.get(RESULT_FILENAME), imageBytes);
    }
}


		
		
		
		
		
		
		
		
		
/*	
		
		
		TakesScreenshot screenshot = (TakesScreenshot) Driver.driver;


		File source = (screenshot.getScreenshotAs(OutputType.FILE));
		
//		Shutterbug.shootPage(Driver.driver,Capture.FULL,true).save(System.getProperty("user.dir"+"\\fullPage.png"));
		

		// Create a new PDF document
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));

			// Open the PDF document
			document.open();

			// Load the captured screenshot as an image
			Image image = Image.getInstance(source.getAbsolutePath());

			// Set the size of the image to fit the PDF document
			image.scaleToFit(document.getPageSize());

			// Add the image to the PDF document
			document.add(image);

			// Close the PDF document
			document.close();

			System.out.println("Webpage converted to PDF successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Quit the WebDriver
			Driver.driver.quit();
		}
	}
}
*/