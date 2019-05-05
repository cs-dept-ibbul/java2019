package practicalClass;

import java.util.Scanner;
//program to break file address into file path, file name and its extension
public class labTwo_addressBreak {
	public static void main(String[] args) {
		Scanner file=new Scanner(System.in);
		String path;
		boolean check=false;
		do {
			System.out.println("Please enter File path: ");
			path=file.nextLine();
			if (path.contains("\\") && path.contains(".")) {
				int index=path.lastIndexOf("\\");
				int ext=path.lastIndexOf(".");
				String fileName=path.substring(index+1, ext);
				String filePath=path.substring(0, index);
				String fileExt=path.substring(ext+1);
				System.out.println("\nFor the full name: "+path);
				System.out.println("Directory: "+filePath+" \nFile name: "+fileName+" \nExtension: "+fileExt);
				check=true;
			}
			else {
				System.out.println("Invalid Path ");
			}
		}while(!check);
	}
}
