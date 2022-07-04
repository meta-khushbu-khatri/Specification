public class area{
	
public static void main(String args[]){
	
	double r=3.2;
	double a=4.0,h=10.0,w=20.0,l=10.0,b=21.0;
	
	System.out.println("area of circle is:-" +circle(r));
	System.out.println("area of square is:-" +square(a));
	System.out.println("area of triangle is :-" +triangle(w,h));
	System.out.println("area of rectangle is:-" +rectangle(l,b));
	}


static double circle(double r) {
	
	return (22*r*r)/7;
}
static double square(double a) {
	
	return (a*a);
}
static double triangle(double w, double h) {
	
	return (w*h)/2;
}
static double rectangle(double l, double b) {
	
	return (l*b);
}
}

