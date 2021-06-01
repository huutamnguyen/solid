package com.solid.solid.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptUtils {
	private EncryptUtils()
	{
	super();
	}
	// Encryte Password with BCryptPasswordEncoder
	public static String encrytePassword(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}

	public static Boolean checkPassWord(String password, String hashPassword)
	{
		return BCrypt.checkpw(password, hashPassword);
	}
}
