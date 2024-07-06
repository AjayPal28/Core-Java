package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SupportFuncs.isFactor(2,10))
            System.out.println("2 is factor of 10");

        System.out.println("Smallest Factor common to both 35 and 105 is " + SimpleMathFuncs.lcf(24,15));
        System.out.println("Largest Factor common to both 35 and 105 is " + SimpleMathFuncs.hcf(24,15));
    }
}
