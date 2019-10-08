package com.kccoe.snapbox.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = -5338348763942421048L;
	private String username;
	private String password;

}
