package com.testTechnique.JeuDeCarte;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class JeuDeCarteApplicationTests {


	@Test
	void contextLoads() {
	}

	@Test
	void whenUneMainNonOrdonne_thenShouldReturnOK() {

		Map<String, String> uneMainMapTriee = new HashMap<>();
		uneMainMapTriee.put("VALET-de-TREFLE","413");
		uneMainMapTriee.put("ROI-de-TREFLE","411");
		uneMainMapTriee.put("6-de-TREFLE","406");
		uneMainMapTriee.put("5-de-TREFLE","405");
		uneMainMapTriee.put("8-de-PIQUE","308");
		uneMainMapTriee.put("6-de-PIQUE","306");
		uneMainMapTriee.put("9-de-COEUR","209");
		uneMainMapTriee.put("8-de-COEUR","208");
		uneMainMapTriee.put("VALET-de-CARREAUX","113");
		uneMainMapTriee.put("DAME-de-CARREAUX","112");
		uneMainMapTriee.put("8-de-CARREAUX","108");


		Map<String, String> uneMainMapNonTriee = new HashMap<>();
		uneMainMapNonTriee.put("8-de-COEUR","208");
		uneMainMapNonTriee.put("ROI-de-TREFLE","411");
		uneMainMapNonTriee.put("6-de-PIQUE","306");
		uneMainMapNonTriee.put("VALET-de-TREFLE","413");
		uneMainMapNonTriee.put("8-de-PIQUE","308");
		uneMainMapNonTriee.put("5-de-TREFLE","405");
		uneMainMapNonTriee.put("8-de-CARREAUX","108");
		uneMainMapNonTriee.put("6-de-TREFLE","406");
		uneMainMapNonTriee.put("9-de-COEUR","209");
		uneMainMapNonTriee.put("DAME-de-CARREAUX","112");
		uneMainMapNonTriee.put("VALET-de-CARREAUX","113");

		assertThat(JeuDeCarteApplication.trierUneMain(uneMainMapNonTriee))
				.isEqualTo(uneMainMapTriee);
	}
}
