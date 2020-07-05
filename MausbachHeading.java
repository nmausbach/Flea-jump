
package mausbach_final;

import java.text.*;
import java.util.*;

/**
 * @author Nathan Mausbach 
 */

public class MausbachHeading {

	public MausbachHeading()	{}

	

	public static void getHeader(String x)	{
		String date;
		String assignNumber = x;
		String name = "Nathan Mausbach";
		Date now = new Date();
		DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
		date = longDate.format(now);
		System.out.println("\n\n" + name);
		System.out.println(assignNumber);
		System.out.println(date);
		System.out.println();
	}

}