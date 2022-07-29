package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor	//TestDTO(){}
@AllArgsConstructor	//TestDTO(String name,String age, String addr)
@Builder
@Component
public class TestDTO {
	private String name;
	private String age;
	private String addr;
}
