package com.caiata.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.caiata.utils.GlobalParameters.RESOURCES_PATH;

public class Utility {
    /**
     * Metodo per caricare il file .properties che ci interessa
     * @param propName stringa che passiamo per richiamare il nome del .properties
     * @return
     */
    public static Properties loadProp(String propName){

        String propPath = RESOURCES_PATH  + File.separator + "properties" + File.separator + propName + ".properties";
        Properties prop = new Properties();

        try{
            prop.load(new FileInputStream(propPath));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("File " + propName + " non trovato.");
        }
        return prop;
    }
}
