//3.2.8
public class Interval
{
private double min;
 private double max;

         public Interval(double min, double max)
{
 if (min <= max)
 {
 this.min = min;
 this.max = max;
 }
 }

        public double min() {
return min;
 }

         public double max() {
return max;
 }

         public boolean intersects(Interval obj)
{
 if (this.max < obj.min || this.max < this.min)
return false;
return true;
 }

         public boolean contains(double x)
{
 return (min <= x) && (x <= max);
 }

         public String toString() {
return "[" + min + ", " + max + "]";
 }
}
