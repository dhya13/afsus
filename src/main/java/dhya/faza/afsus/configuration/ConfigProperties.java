package dhya.faza.afsus.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

    @Autowired
    private GlobalProperties globalProperties;
    
    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item item() {
        GlobalProperties a = this.globalProperties;
        return new Item();
    }
}


 class Item {
    private String name;
    private int size;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getSize() {
         return size;
     }

     public void setSize(int size) {
         this.size = size;
     }
 }