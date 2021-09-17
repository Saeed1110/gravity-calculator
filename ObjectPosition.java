
import java.util.*;
import java.lang.*;

class ObjectPosition
{  
    public static void main(String args[])
    {
        double a = -9.81;
        double t = 10.0;
        double vi = 0.0;
        double xi = 0.0;
        double finalPosition = 0.5 * a * (t * t) + vi + xi;
        System.out.println("Finally object position is: " + finalPosition);
    }
}