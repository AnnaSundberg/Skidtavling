/**
 * 
 */
package com.ya.skidtavling.competion;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Hans Stål
 * Skidtävlingar
 * samlade fil_las_skriv
 * Huvudsakligen intern mellanlagring
 * 2021-12-18
 *
 */
public class Filio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String srcepath = "C://test//incidents.txt";
//		String[] rows;
//		rows = readfiledatatoString(srcepath);
//		int n = rows.length;
//		for (int i =0; i <n; i++)
//		{
//			System.out.println(rows[i]);
//		}
//		
	}
	
	public static int getFilesize(String path)		
	{
	/*
	 * read file to determine number of rows	
	 */
		String row = "";
		int rowcnt =0;
		try
		{
			var instrom = new BufferedReader
						(new FileReader(path));
		while (row != null)
		{
			row = instrom.readLine();
			
//			System.out.println(line + i);
			rowcnt++;
			
		}
		instrom.close();
		}
		catch (Exception io)
		{
			System.out.println("fel vid filläsning!!" +rowcnt);
			rowcnt =-1;
			
		}
		rowcnt--;
		
//		System.out.println("antal lästa rader!!" +rowcnt);
		return rowcnt;			
		}


	public static String[]readfiledatatoString(String srcepath) {
		//String srcepath = "C://test//incidents.txt";
	
		boolean isOK;
		
		boolean atend = false;		// TODO Auto-generated method stub
//		System.out.println("beräknar filstorlek...");
		int postant = getFilesize(srcepath);
//		System.out.println("postantal"+postant);
		
		String[] filedata = new String[postant];
		{
					
				
					String line="";
					int i=0;
					try
					{
						var instrom = new BufferedReader
									(new FileReader(srcepath));
					while (line != null)
					{
						line = instrom.readLine();
						
						if (line !=null) {
							filedata[i]= line;
							i++;
						}
	
					}
					instrom.close();
//					System.out.println("post i"+i);
					}
					catch (Exception ex)
					{
						System.out.println("Fel vid filläsning !!");
						return null;
					}
		return filedata;		
	}
			
	}				
}
	


