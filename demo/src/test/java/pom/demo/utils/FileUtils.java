package pom.demo.utils;

import java.io.File;

public class FileUtils {

	public static void deleteScreenShotDirectory() {

		File screenShotDir = new File("./screenshots");
		File[] files = screenShotDir.listFiles();
		for (File eachFile : files) {
			eachFile.delete();
		}
		boolean status = screenShotDir.delete();
		System.out.println("Is Deleted? " + status);
	}

}
