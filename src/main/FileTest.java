package main;

import java.io.File;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) {
		String forcedFolder = "E:\\WORK\\ForcedFile\\";
		String root = "E:\\WORK\\2023우표전시회_AI\\stamp-김웅섭\\";
		File file = new File(root);
		File[] list = file.listFiles();
		Arrays.sort(list, new ModifiedDate());
		for(File f : list) {
			System.out.println(f.getName());
		}
		int idx = 0;
		for(File f : list) {
			File newFile = new File(root + "wolf_" + idx + ".jpg");
			f.renameTo(newFile);
			idx++;
		}
	}
}
