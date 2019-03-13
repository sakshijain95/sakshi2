package testingqa;



import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo {
    @Test(priority = 2)
    public void abc()
    {

        System.out.println("1st annotation : " +"First method");
    }
    @Test(description= "Test First" , priority = 4)
    public void firstM()
    {
        System.out.println("2nd annotation : "+"Seond Method");
    }

    @Test(description = "Test Third",priority =3)
    public void thirdM()
    {
        System.out.println("3rd annotation : "+"Third Method");
    }

    @Test(description = "Test Second" , priority = 1)
    public void secondM()
    {
      /*  String str = "skshi";
        String str1="sakshi";
        Assert.assertEquals(str,str1);*/
        System.out.println("4th annotation : "+"forth Method");
    }


}
