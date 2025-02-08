import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import utils.ExcelUtils;

public class MainRunner {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		List<Map<String, Object>> fullData = ExcelUtils.readExcel();
		System.out.println(fullData);
		System.out.println(fullData.size());
		
	}

}
