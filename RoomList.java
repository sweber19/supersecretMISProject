package c9MISProject;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

///
///@Steven Weber
///
public class RoomList {
	
	public static void main(String[] args) throws FileNotFoundException{
	
	Scanner console = new Scanner(System.in);
	 String inputFileName = "hotel.txt";
	 File inputFile = new File(inputFileName);
	 Scanner in =  new Scanner(inputFile);
	 System.out.print("Output file: ");
	 String outputFileName = console.next();
	 PrintWriter out = new PrintWriter(outputFileName);
	
	ArrayList<String> ratePerNight = new ArrayList<String>();
	ArrayList<String> beds = new ArrayList<String>();
	ArrayList<String> kitchenette = new ArrayList<String>();
	ArrayList<String> handicap = new ArrayList<String>();
	
	
	
	while(in.hasNextLine()){
		String line =  in.nextLine();
		int i = 0;
			while (!Character.isDigit(line.charAt(i))) {
				i++;
			}
			String rate = line.substring(2,i);
			String bedcheck = line.substring(3,i);
			String kitchenetteCheck = line.substring(0,i);
			String handiCheck = line.substring(1,i);
		
			ratePerNight.add(rate);
			beds.add(bedcheck);
			kitchenette.add(kitchenetteCheck);
			handicap.add(handiCheck);
		
	}
	System.out.println(ratePerNight);
	System.out.println(beds);
	in.close();
	out.close();
	console.close();
