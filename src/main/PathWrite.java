package main;

import java.io.File;
import java.io.FileWriter;

public class PathWrite {

	public static void main(String[] args) {

		String url = "teriwoo0519.cafe24.com";
		String path = "E:\\WORK\\온라인우표전시회_출품작\\2023대한민국우표전시회(제출용)\\";
		String[] sort = { "children", "choongchung", "jeju", "junbuk", "junnam", "kangwon", "kyungbuk", "kyungin",
				"kyungnam", "seoul" };
//		int[] childrens = { 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 16, 16, 16, 16, 16, 16, 32, 16, 16 };
		int[] childrens = new int[19];
		int[] choongchungs = new int[9];
		int[] jeju = new int[20];
		int[] junbuk = new int[9];
		int[] junnam = new int[13];
		int[] kangwon = new int[23];
		int[] kyungbuk = new int[9];
		int[] kyungin = new int[21];
		int[] kyungnam = new int[21];
		int[] seoul = new int[24];
		int[][] arr = {childrens, choongchungs, jeju, junbuk, junnam, kangwon, kyungbuk, kyungin, kyungnam, seoul};
		
		
		int idx = 1;
		for(String middle : sort) {
			
			File big = new File(path + middle);
			if(big.isDirectory()) {
				for(int x = 0; x<big.list().length - 2; x++) {
					File small = new File(path + middle + "\\" + middle + "_" + (x+1));
					arr[idx-1][x] = small.list().length;
//					System.out.println(arr[idx-1][x]);
				}
				
			}
			idx++;
		}
		int id = 10;
		try {
			File file = new File("C:\\Users\\thra_\\Desktop\\2023우표전시회\\path.txt");
			FileWriter fw = new FileWriter(file, true);
			
			for(int a=0; a<sort.length; a++) {
				for(int y=0; y<arr[a].length; y++) {
					for(int z=0; z<arr[a][y]; z++) {
						System.out.println(url + "\\" + sort[a] + "\\" + sort[a] + "_" + (y+1) + "\\" + (y+1) + "_" + (z+1) + ".jpg" + ", " + id + "\r\n");
						fw.write(url + "\\" + sort[a] + "\\" + sort[a] + "_" + (y+1) + "\\" + (y+1) + "_" + (z+1) + ".jpg" + ", " + id + "\r\n");
						fw.flush();
					}
					id++;
				}
			}
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
