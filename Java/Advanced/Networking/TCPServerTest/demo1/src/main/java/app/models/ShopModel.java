package app.models;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ShopModel {
    
    private Properties items = new Properties();

    private ShopModel() {}

    public static ShopModel build(){
        try(var input = new FileInputStream("EviTek.store")){
            var shop = new ShopModel();
            // Loads all of the properties represented by the XML document on the specified input stream into this properties table.
            shop.items.loadFromXML(input);
            return shop;
        }catch(IOException e){
            return null;
        }
    }

    public String getItemInfo(String name) {
        //getProperty(String key)
        //Searches for the property with the specified key in this property list.
        return items.getProperty(name);
    }
}
