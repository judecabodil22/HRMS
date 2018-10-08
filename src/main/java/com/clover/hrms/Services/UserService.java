package com.clover.hrms.Services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	List<String> name = Arrays.asList("Gandalf the Grey","Frodo Baggins","Bilbo Baggins","Denethor","Boromir","Elrond Half-Elven","Saruman the White","Gandalf the Grey","Sauron","Echtelion","Aragorn","Legolas","Gimli","Arwen","Eowen","Peregrin Took","Galadriel","Faramir","Eomer","Celeborn","Isildur","Radagast the Brown","Gamling","Anarion","Dain II Ironfoot");

	
	
	
	
	public String generateName()
	{
		Collections.shuffle(name);
		
		return name.get(0);
		
	}
	
}
