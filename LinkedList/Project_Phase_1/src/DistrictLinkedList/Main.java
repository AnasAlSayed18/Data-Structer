//Anas Al Sayed **1221020**

package DistrictLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import application.District;
import application.DistrictLinkedList;
import application.DistrictNode;
import application.Location;
import application.LocationList;
import application.LocationNode;
import application.Martyr;
import javafx.geometry.Pos;

public class Main {
	static DistrictLinkedList Dlist ;

	public static void main(String[] args) throws FileNotFoundException {
		 LocationList w = new LocationList();
		 LocationList z = new LocationList();
		  Dlist = new DistrictLinkedList();
		 District d2 = new District("Hebrown");
		 District d3 = new District("AEW");

		 Location x1=new Location("Dura");
		 Location x3=new Location("WWE");
		 read();

			
		 //readDistrict( new File ("D:\\ANAS\\UNIVARSITY\\Second year\\second symester\\Data Structer\\Projects\\Project_phase1\\wwe.txt"));
		//Dlist.addLast(d2);

		//Dlist.addLast(d3);
		 
	//Dlist.printList1();
		//Dlist.locationToString("Bethlehem");
	//	Dlist.getFirst().ls.martyrToString("Bethlehem");;
//
//			arr.addLast(new District("B"));
			
		 
//		 VB.setAlignment(Pos.CENTER);
//			VB.setStyle("-fx-border-color:red;"
//					+ "-fx-border-radius:30;"
//					+ "-fx-border-width:8;");
	//System.out.println(Dlist.TotalDate("Tulkarm", "5/10/2023"));;

	//Dlist.locationToString("Hebron");
	System.out.println("****************************************");	
	// Dlist.locationToString("al-Quds");
			
//			
//			w.addFirst(x1);
//
//			w.addFirst(x3);
//
//			w.addFirst(x1);
//			w.addFirst(new Location("B"));
//
//			w.addFirst(new Location("c"));
//			
//
//			w.addMartyr(new Martyr( "Anas", new Date("1/5/2000"),20,x1,d2 ,"M"));
//
//			w.addMartyr(new Martyr( "Mosa", new Date("1/5/2000"),30,x1,d2  ,"F"));
//			w.addMartyr(new Martyr( "Ahmad", new Date("2/1/2001"),40,x1,d2   ,"M"));
//			w.addMartyr(new Martyr( "Ali", new Date("2/1/2000"),90,x1,d2   ,"M"));
//			w.addMartyr(new Martyr( "x", new Date("2/1/2000"),50,x1,d2  ,"M"));
//			
//			w.addMartyr(new Martyr( "y", new Date("1/5/2000"),50,x1,d2  ,"M"));
//			w.addMartyr(new Martyr( "z", new Date("1/5/2000"),50,x1,d2  ,"M"));
//

			
			
	//	Dlist.addLocation(d2.getDname(),w);
	//	System.out.println(arr.TotalDateCount());
		
		//System.out.println( (arr.getFirstLocation("Hebrown")).getLname());
	//	arr.addLocation(d3.getDname(),z);
		System.out.println("/////////////////");
		//System.out.println(Dlist.TotalMartyrNumberInDate("Hebron", "6/10/2001"));;
//		System.out.println(Dlist.getDistrict("Bethlehem").Llist.getMartyrCount("'Aydah R.C."));;
//		System.out.println(Dlist.getDistrict("Bethlehem").Llist.getMartyrMaleCount("al-Khader"));;
//		System.out.println(Dlist.getDistrict("al-Quds").Llist.getMartyrFmaleCount("Bidu"));;
//		System.out.println(Dlist.getDistrict("Bethlehem").Llist.getMartyrAverage("al-Khader"));
//		System.out.println(Dlist.getDistrict("Bethlehem").Llist.youngestMartyr("al-Khader").getName());;
//		System.out.println(Dlist.getDistrict("Bethlehem").Llist.oldestMartyr("al-Khader").getName());;
//		Dlist.getDistrict("Bethlehem").Llist.MartyrToString("al-Khader");;

		System.out.println("/////////////////");

		//Dlist.getDistrict("Bethlehem").Llist.removeMartyr("al-Khader","Zeid Muhammad Sa'id Ghneim");
		//System.out.println(Dlist.getDistrict("Bethlehem").Llist.getMartyrCount("al-Khader"));;

//System.out.println(((Martyr)Dlist.getDistrict("Bethlehem").Llist.getMartyr("al-Khader","Zeid Muhammad Sa'id Ghneim").getData()).getName());
		System.out.println("************************************");
		//System.out.println(((Martyr)Dlist.getDistrict("Bethlehem").Llist.searchMartyr("Sbieh").getData()).getName());
		;		System.out.println("************************************");

	//	Dlist.getDistrict("Bethlehem").Llist.removeMartyerByData(Dlist.getDistrict("Bethlehem").Llist.searchMartyr("Sbieh").getData(),"Bethlehem");
	//	Dlist.getDistrict("Bethlehem").Llist.MartyrToString("al-Khader");;

		
		
System.out.println("/////////////////");
		//System.out.println(Dlist.totalAgeAverage("Bethlehem"));
		System.out.println("/////////////////");
		//System.out.println(Dlist.TotalDate("Bethlehem","1/10/2003"));
		//System.out.println(Dlist.TotalMartyrNumberInDate("Bethlehem","1/10/2003"));
	//	System.out.println(Dlist.TotalDateCount("al-Quds"));
	//	System.out.println(Dlist.TotalDateCount("Jenin"));
		//System.out.println(Dlist.TotalDateCount("Bethlehem"));
		//System.out.println(Dlist.TotalDateCount("Hebron"));

		System.out.println("/////////////////");
		
	//	System.out.println(Dlist.TotalMartyrNumberInDate(Instant.ofEpochMilli((new Date("8/3/2003")).getTime()).atZone(ZoneId.systemDefault()).toLocalDate()));
		System.out.println(Dlist.TotalDateCount(("al-Quds")).toLocaleString());
System.out.println(Dlist.TotalMartyrNumberInDate(Instant.ofEpochMilli((new Date("8/3/2003")).getTime()).atZone(ZoneId.systemDefault()).toLocalDate()));
System.out.println(Dlist.TotalMartyrNumberInDate_forDistrict("al-Quds",Instant.ofEpochMilli((new Date("7/21/2017")).getTime()).atZone(ZoneId.systemDefault()).toLocalDate()));

//Dlist.TotalDateCount(((District)temp.getData()).getDname()).toLocaleString());
		System.out.println("/////////////////");

		//Dlist.locationToString("Bethlehem");
		//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("al-Khader");
		//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("'Aydah R.C.");

		////
//		System.out.println(Dlist.getTotalMale("Hebron"));
////			
//			System.out.println(Dlist.getTotalFmale("Hebron"));
////
//			System.out.println(Dlist.totalAgeAverage("Hebron"));
//******System.out.println(Dlist.TotalDateCount("Salfit"));

		//arr.printList1();
		//arr.printList1();
		//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("'Aydah R.C.");;

	System.out.println("-----------------");
	//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("al-Khader");;

	System.out.println("-----------------*********-------------------");
	//Dlist.getDistrict("Gaza").Llist.removeMartyrByData("Gaza City", "Rabah 'Othman Mustafa Haji");
//System.out.println(Dlist.getDistrict("Bethlehem").Llist.removeMartyr("al-Khader", "Sa'id Sbieh"));
	//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("al-Khader");;
System.out.println("-------------------------------");
//Dlist.getDistrict("Bethlehem").Llist.MartyrToString("'Aydah R.C.");;


//Martyr m=(Martyr)Dlist.getDistrict("Bethlehem").Llist.getMartyr("'Aydah R.C.","Tareq Mahmoud 'Abd al-Qader Jadu").getData();

//System.out.println(m.getName());

//arr.uppdateDistrict("FA","WWE");;

	//	arr.printList1();
	//Dlist.locationToString("Hebron");


		//arr.locationToString("Hebrown");
		//arr.removeDistrict("WWE");
System.out.println("-----------------");

//w.locationToString();




	}
			public static void read() throws FileNotFoundException {

        File file=new File ("D:\\ANAS\\UNIVARSITY\\Second year\\second symester\\Data Structer\\Projects\\Project_phase1\\data1.csv");
        Scanner input=new Scanner(file);

        input.nextLine();
    	long e = System.currentTimeMillis();

        while(input.hasNextLine()) {
            String line=input.nextLine();
            String []token=line.split(",");

            if(token[2].equals("")) {
                token[2]="0";
            }

            DistrictNode dtemp=Dlist.getDistrict(token[4]);
            if(dtemp!=null) {
                LocationNode l2=dtemp.Llist.getLocation(token[3]);
                if(l2!=null) {
                    dtemp.Llist.addMartyr(new Martyr(token[0],new Date(token[1]),Integer.parseInt(token[2]),((Location)l2.getData()),((District)dtemp.getData()),token[5]));
                }
                else {
                	
                    dtemp.Llist.addFirst(new Location(token[3]));

                    Dlist.addLocation(token[4], dtemp.Llist);

                    LocationNode l3=dtemp.Llist.getLocation(token[3]);
                    dtemp.Llist.addMartyr(new Martyr(token[0],new Date(token[1]),Integer.parseInt(token[2]),((Location)l3.getData()),((District)dtemp.getData()),token[5]));
                }
            }
            else {
                Dlist.addFirst(new District (token[4]));
                DistrictNode d=Dlist.getDistrict(token[4]);
                d.Llist.addFirst(new Location(token[3]));
                
                Dlist.addLocation(token[4], d.Llist);
                LocationNode l1=d.Llist.getLocation(token[3]);
                d.Llist.addMartyr(new Martyr(token[0],new Date(token[1]),Integer.parseInt(token[2]),((Location)l1.getData()),((District)d.getData()),token[5]));
            }
        }
        System.out.println(System.currentTimeMillis()-e);
    }
}
