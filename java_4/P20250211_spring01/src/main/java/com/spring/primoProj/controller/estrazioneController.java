package com.spring.primoProj.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class estrazioneController {

	@GetMapping(path = "/lotto")
	public List<Integer> lotto() {

		Set<Integer> numeriEstratti = new HashSet<>();
		Random a = new Random();

		while (numeriEstratti.size() < 5) {
			numeriEstratti.add(a.nextInt(1, 91));
		}

		return new ArrayList<>(numeriEstratti);

	}
}
