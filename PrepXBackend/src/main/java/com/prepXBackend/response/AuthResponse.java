package com.prepXBackend.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

	private String jwt;
	private String message;
	private Long userId;
	private String nameString;
}
