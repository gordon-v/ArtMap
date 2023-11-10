package com.artmap.artmapproject;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class ArtMapProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtMapProjectApplication.class, args);

        Path path = Paths.get("src/main/resources/files/art.xml");

        String stringXML;
        try {
            stringXML = Files.readAllLines(path).toString();
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file.");
        }
        System.out.println(stringXML);
        JSONObject jsonObject = XML.toJSONObject(stringXML);
        System.out.println(jsonObject);
    }

}
