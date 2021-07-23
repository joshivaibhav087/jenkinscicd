package com.axis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class axiscontroller {
	
	public class BookController{
		
		@GetMapping("/books")
		public String welcomemsg() {
			return "reading books";		}
	}

}
