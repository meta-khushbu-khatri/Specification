public class marksheet{
	
	static int marks[]= {100,55,34,43,54,34,66};
	static int len=marks.length-1;
	
	public static int average(){
		
		int total=0;
		
		for(int i=0;i<=len;i++)
		{
			
			total+=marks[i];
		
		}
		return total/len;
}
	
public static int minimum(){

	int min=100;
	
	for(int i=0; i<=len;i++)
	{
		if(marks[i]<min)
			min=marks[i];
	}
	
	return min;
}

public static int maximum(){
	
	int max=-1;
	
	for(int i=0; i<=len;i++)
	{
		
		if(marks[i]>max)
			max=marks[i];
	
	}
	 return max;
}
public static double pass_per(){
	
	int n=0;
	for(int i=0; i<=len;i++)
	{
		
		if(marks[i]>=40)
					
			n++;
	}
		double percent = (double)n*100/(double)len;
	return percent;
}

public static void main(String args[]){
	
	System.out.println("average:- " +average());
	System.out.println("minimium:- " +minimum());
	System.out.println("maximum:- " +maximum());
	System.out.println("passes:- " +pass_per());
	
	}
}
