import java.util.Scanner;

public class string{
	int equal(String str1, String str2){
		
		int equal = 1;
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1==len2)
			{
				for(int i= 0 ; i<len1;i++)
				{
					if ((str1.charAt(i)) != (str2.charAt(i)))
					{
						equal = 0;
						break;
					}
				}
		}else
			{
				equal = 0;
			}
		return equal;
	}
	
String reverse(String str) {
	
	String revStr="";
	
	for(int i=0;i<str.length();i++) 
	{
		
		revStr=(str.charAt(i))+revStr;
		
	}
	return revStr;
	
	}
String convertCase(String str){
	
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower="abcdefghijklmnopqrstuvwxyz";
	String Change="";
	
	for(int i=0;i<str.length();i++) 
	{
		char ch=str.charAt(i);
		if(upper.indexOf(ch)>=0)
		{
			Change+=lower.charAt(upper.indexOf(ch));
		}
		else if(lower.indexOf(ch)>=0)
				{
			Change+=upper.charAt(lower.indexOf(ch));
				}
		else
		{
			Change+=ch;
		}
		
	}
		return Change;
	}

String largestWord(String s){
	
		s+=' ';
		String temp="";
		String max="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
			else 
			{
				max=(max.length()<=temp.length()?temp:max);
				temp="";
			}
		}
		return max;
	}

public static void main(String[] args){
	
	string s= new string();
	Scanner scan=new Scanner(System.in);
	System.out.println("select tghe operation\n1. compare string \n2. reverse string\n3. convert case \n4. largest word");
	
	int ch=scan.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("enter string");
		String str1=scan.next();
		System.out.println("second");
		String str2=scan.next();
		int result=s.equal(str1, str2);
		System.out.println("String is "+result);
		break;
	case 2:
		System.out.println("enter string");
		str1=scan.next();
		String rev=s.reverse(str1);
		System.out.println("String is "+rev);
		break;
	case 3:
		System.out.println("enter string");
		str1=scan.next();
		String Ccase=s.convertCase(str1);
		System.out.println("convert "+Ccase);
		break;
	case 4:
		System.out.println("enter string");
		scan.nextLine();
		str1=scan.nextLine();
		String max=s.largestWord(str1);
		System.out.println("largest word is "+max);
		break;
	}
}
}

