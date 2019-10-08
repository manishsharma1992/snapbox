package com.kccoe.snapbox.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "user")
public class UserDomain {
	
	private String username;
	private String password;

}
