package com.david122.answer.utils;

import java.util.Collection;

  
/**        
 * Title: Collection 工具类     
 */      
public class CollectionUtil {
	public static boolean isNotEmpty(Collection<?> c){
		if (c != null && c.size() != 0 ) {
			return true;
		}
		return false;
	}
}
