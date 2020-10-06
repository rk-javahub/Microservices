package com.bookmyshow.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CatalogIteam {
	private String name;
	private String desc;
	private int rating;

}
