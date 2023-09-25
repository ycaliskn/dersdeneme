package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {



    //    Bu sinif configuration.properties file i okumak icin kullanilir
//    property file i okumak icin properti objecsi kullanilir
    private static Properties properties;

    //    static block : ilk calisir

    static {

        String path="configuration.properties";

        try {
            //            configuration.property dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);

            //            properties objesini instantiate ediyoruz
            properties = new Properties();

            //            configuration.properties dosyasindaki datalari yukler
            properties.load(fileInputStream);

            //            file input steam i kapatilir
            fileInputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
