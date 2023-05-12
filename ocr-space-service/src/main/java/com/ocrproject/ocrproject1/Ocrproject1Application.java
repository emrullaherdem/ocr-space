package com.ocrproject.ocrproject1;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import java.io.File;


public class Ocrproject1Application {

	public static void main(String[] args) {
		File imageFile = new File("C:\\Users\\emrul\\Downloads\\image4.jpg");

		// Tesseract OCR motorunu yükle ve yapılandır
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("C:\\Users\\emrul\\Downloads");
		tesseract.setLanguage("tur"); // OCR dilini ayarla (varsayılan İngilizce)

		try {
			// Resmi metne dönüştür
			String result = tesseract.doOCR(imageFile);
			System.out.println(result); // Metni yazdır
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}

}
