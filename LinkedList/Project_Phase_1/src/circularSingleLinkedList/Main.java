//Anas Al Sayed **1221020**
package circularSingleLinkedList;


import java.util.Date;

import application.District;
import application.Location;
import application.LocationList;
import application.Martyr;

public class Main {
	static LocationList arr = new LocationList();
	
	public static void main(String[] args) {

		Location x1=new Location("Dura");

		
		
//		arr.addFirst(new Location("Dura"));
//		arr.addFirst(new Location("WWE"));
//
//		arr.addMartyr(new Martyr( "Anas", new Date(),20,new Location( "Dura"),new District("Hebrown") ,"M"));
//
//		arr.addMartyr(new Martyr( "Mosa", new Date(),44,new Location( "Dura"),new District("Hebrown")  ,"M"));
//		arr.addMartyr(new Martyr( "Ahmad", new Date(),5,new Location( "Dura"),new District("Hebrown")  ,"M"));
//		arr.addMartyr(new Martyr( "Ali", new Date(),90,new Location( "WWE"),new District("Hebrown")  ,"M"));
//		arr.addMartyr(new Martyr( "yoyo", new Date(),23,new Location( "WWE"),new District("Hebrown")  ,"M"));
;

//System.out.println(arr.oldestMartyr("Dura").getName());
System.out.println(arr.getMartyrMaleCount("Dura"));
		//arr.martyrToString("wwe");
		System.out.println();
		//System.out.println(arr.getMartyrCount("WWE"));;






	}

}
