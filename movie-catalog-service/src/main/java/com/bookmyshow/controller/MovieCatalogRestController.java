/**
 * 
 */
package com.bookmyshow.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.entity.CatalogIteam;

/**
 * @author Rohit
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogRestController {

	@RequestMapping("/{userId}")
	public List<CatalogIteam> getCatalog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatalogIteam("Swadesh", "Social movie", 5));

	}

}
