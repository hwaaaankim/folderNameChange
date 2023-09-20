package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ForderNameChange {

	public static void main(String[] args) {
		String rootPath = "E:\\WORK\\temp\\stamp-심주임\\";
		
		File dir = new File(rootPath);
		File[] list = dir.listFiles();
		File[] reList = new File[list.length];
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int x=0; x<list.length; x++) {
			m.put(Integer.valueOf(list[x].getName()), x);
		}
		List<Integer> inxKey = new ArrayList<>(m.keySet());
		
		String newName = "E:\\WORK\\2023우표전시회_AI\\stamp-심주임\\sim_";
		int p=0;
		for (int key : inxKey) {
            System.out.print("Key : " + key);
            System.out.println(", Val : " + m.get(key));
            reList[p] = list[m.get(key)];
            p++;
        }
		int sign = 0;
		for(int i=0; i < reList.length; i++) {
			if(i==60) {
				if(reList[i].isDirectory()) {
					File newFile = new File(newName + (i+1+1));
					reList[i].renameTo(newFile);
					sign++;
				}
			}else if(i>=64 && i<=78){
				if(reList[i].isDirectory()) {
					File newFile = new File(newName + (i+15+1));
					reList[i].renameTo(newFile);
					sign++;
				}
			}else {
				if(reList[i].isDirectory()) {
					File newFile = new File(newName + (i+sign+1));
					reList[i].renameTo(newFile);
				}
			}
			
		}
		
		
//		int idx = 1;
//		for(File file : dir.listFiles()) {
//			if(file.isDirectory()) {
//				File newFile = new File(newName + idx);
//				file.renameTo(newFile);
//				idx++;
//			}
//		}
	}

}
