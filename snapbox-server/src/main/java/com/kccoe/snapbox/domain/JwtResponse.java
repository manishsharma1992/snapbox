package com.kccoe.snapbox.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 5906390798481180889L;
	private final String jwttoken;

}
