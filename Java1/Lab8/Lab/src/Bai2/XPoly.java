
package Bai2;

public class XPoly 
{
    public static final double sum (double ...x)
    { 
        double tong =0;
        for(double so :x)
        { 
            tong += so;
        }
        return tong ;
    }
    public static final double min(double ...x)
    { 
        double giatri = x[0];
        for( double so : x)
        { 
            giatri = Math.min(giatri,so);
        }
        return giatri;
    }
     public static final double max(double ...x)
     { 
        double giatri = x[0];
        for( double so : x)
        { 
            giatri = Math.max(giatri,so);
        }
        return giatri;
    }

}
