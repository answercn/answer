package com.david122.answer.utils;

import java.util.UUID;

  
/**        
 * Title: 生成UUID    
 */      
public class CodecUtil {
	
	public static String createUUID(){
		return UUID.randomUUID().toString();
	}
}
