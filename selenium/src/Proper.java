import java.io.*;
import java.util.Properties;

public class Proper
{

    public static void main(String[] args) {
        Properties prop = new Properties();
        File f = new File("/home/ttn/IdeaProjects/silenium/src/abc.properties");
        FileInputStream fip = null;
        try {
            fip = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            prop.load(fip);
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(prop.getProperty("FNAME","Sakshi"));
    }
}
