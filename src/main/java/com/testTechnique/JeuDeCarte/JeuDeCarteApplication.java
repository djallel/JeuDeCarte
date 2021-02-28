package com.testTechnique.JeuDeCarte;

import com.testTechnique.JeuDeCarte.service.ConstruireService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

@SpringBootApplication
public class JeuDeCarteApplication {


    public static void main(String[] args) {

        SpringApplication.run(JeuDeCarteApplication.class, args);

        ConstruireService construireService = new ConstruireService();

        Map<String, String>			uneMainNonTrieeMap  = construireService.construireUneMainDeDixMap();

        out.println("---------Main non triée --------------");
		uneMainNonTrieeMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        out.println("********* Main triée à partir de l'ancienne main *****************");
        trierUneMain(uneMainNonTrieeMap);


    }

    public static Map<String, String> trierUneMain(Map<String, String> uneMainNonTrieeMap) {
        Map<String, String> mainTriee = new LinkedHashMap<>();
        uneMainNonTrieeMap.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .forEachOrdered(x -> mainTriee.put(x.getKey(), x.getValue()));

        mainTriee.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        return mainTriee;
    }

}
