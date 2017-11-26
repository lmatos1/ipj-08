//3.2.8
public class ClientInterval
{
 public static void main(String[] args) {

 Interval intvl1=new Interval(1.0, 5.0);
 System.out.println("Interval object");
 System.out.println(intvl1.toString());


 double x=2.0;


 if(intvl1.contains(x))
 System.out.println("The interval "+intvl1.toString()
            +" contains "+x);

 Interval intersect=new Interval(2.0, 3.0);

 if(intvl1.intersects(intersect))
 System.out.println(intvl1+" intersects "+intersect);
 }
}