package newyeargift;

import java.util.Scanner;

public class Finalgift extends Gift {
	public static void main(String[] args)
	{
		System.out.println("#################"+"MENU"+"################");
		System.out.println("#################"+"CHOCLATES"+"################");
		System.out.println("BRAND"+"		"+"WEIGHT"+"		"+"PRICE");
		System.out.println("DAIRYMILK"+"	"+"10KG"+"		"+"100RS");
		System.out.println("KITKAT"+"		"+"50KG"+"		"+"120RS");
		System.out.println("PERK"+"		"+"30KG"+"		"+"110RS");
		System.out.println("\n");
		System.out.println("#################"+"SWEETS"+"################");
		System.out.println("BRAND"+"		"+"WEIGHT"+"		"+"PRICE");
		System.out.println("LADDU"+"		"+"10KG"+"		"+"150RS");
		System.out.println("KAJU"+"		"+"50KG"+"		"+"120RS");
		System.out.println("JAM"+"		"+"30KG"+"		"+"110RS");
		Scanner sc =new Scanner(System.in);
		int ns;
		String st;
		System.out.println("###################################################");
		System.out.println("enter no of sweets in a gift:");
		ns=sc.nextInt();
		for(int i=1;i<=ns;i++)
		{
			System.out.println("enter the sweet type from the list:");
			st=sc.next();
			System.out.println("enter the weight of sweet:");
			int sw=sc.nextInt();
			System.out.println("enter the price of sweet:");
			int sp=sc.nextInt();
			System.out.println("sweettype:"+st);
			System.out.println("sweetweight:"+sw);
			System.out.println("sweetprice:"+sp);
			Finalgift obj=new Finalgift();
			obj.sweets(sw,sp);
		}
		int nc;
		String ct;
		System.out.println("###################################################");
		System.out.println("enter no of choclate in a gift:");
		nc=sc.nextInt();
		for(int i=1;i<=nc;i++)
		{
			System.out.println("enter the choclate type from the list:");
			ct=sc.next();
			System.out.println("enter the weight of choclate:");
			int cw=sc.nextInt();
			System.out.println("enter the price of choclate:");
			int cp=sc.nextInt();
			System.out.println("sweettype:"+ct);
			System.out.println("sweetweight:"+cw);
			System.out.println("sweetprice:"+cp);
			Finalgift obj=new Finalgift();
			obj.choclates(cw,cp);
		}
		System.out.println("###################################################");
		System.out.println("TOTAL NO. OF CHOCLATES IN GIFT IS:"+nc);
		System.out.println("TOTAL NO. OF SWEETS IN GIFT IS:"+ns);
		System.out.println("###################################################");
		System.out.println("$$ENJOY THE DELICIOUS CHOCLATES AND SWEETS$$");
		System.out.println("THANK YOU");
	}
}
