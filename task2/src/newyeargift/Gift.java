package newyeargift;

public class Gift {
	int swt;
	int spt;
	int cwt;
	int cpt;
	int i,j;
	public void choclates(int a,int b)
	{
		i=a;
		j=b;
		cwt=cwt+i;
		cpt=cpt+j;
		System.out.println("Total choclates weight:"+cwt);
		System.out.println("Total choclates price:"+cpt);
	}
	public void sweets(int a,int b)
	{
		i=a;
		j=b;
		swt=swt+i;
		spt=spt+j;
		System.out.println("Total sweets weight:"+swt);
		System.out.println("Total sweets price:"+spt);
	}
}
