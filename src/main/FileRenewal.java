package main;

import java.io.File;
import java.util.Arrays;

public class FileRenewal {

	public static void main(String[] args) {
		String forcedFolder = "E:\\WORK\\ForcedFile\\";
		String root = "C:\\Users\\thra_\\Documents\\카카오톡 받은 파일\\Extra images\\wolf\\";
		File file = new File(root);
		File[] list = file.listFiles();
		Arrays.sort(list, new ModifiedDate());
		int idx = 0;
		for(File f : list) {
			File newFile = new File(root + "wolf_" + idx + ".jpg");
			f.renameTo(newFile);
			idx++;
		}
	}

}
