package com.korea.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTOTests {

	@Test
	public void test() {
		
		/*
		 * TestDTO dto = new TestDTO("홍길동","44","대구"); dto.setAddr("울산");
		 * System.out.println(dto);
		 */
		
		TestDTO dto = TestDTO.builder()
				.age("55")
				.name("홍길동")
				.addr("주소")
				.build();
		System.out.println(dto);
	}

}
