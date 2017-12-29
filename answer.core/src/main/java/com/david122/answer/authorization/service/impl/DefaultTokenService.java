package com.david122.answer.authorization.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.david122.answer.authorization.service.ITokenService;
import com.david122.answer.utils.CodecUtil;
import com.david122.answer.utils.StringUtil;
  
/**        
 * Title: TokenManager的默认实现    
 * Description: 管理 Token
 */
@Service("defaultTokenService")
public class DefaultTokenService implements ITokenService {

	/** 将token存储到JVM内存(ConcurrentHashMap)中   */      
	private static Map<String, String> tokenMap = new ConcurrentHashMap<String, String>();

	/** 
	 * @description 利用UUID创建Token(用户登录时，创建Token)
	 * @param username
	 * @return       
	 */  
	public String createToken(String username) {
		String token = CodecUtil.createUUID();
		tokenMap.put(token, username);
		return token;
	}

	  
	/** 
	 * @description Token验证(用户登录验证)
	 * @param token
	 * @return     
	 */  
	public boolean checkToken(String token) {
		return !StringUtil.isEmpty(token) && tokenMap.containsKey(token);
	}

	  
	/** 
	 * @description Token删除(用户登出时，删除Token)   
	 * @param token       
	 */  
	@Override
	public void deleteToken(String token) {
		tokenMap.remove(token);
	}
}
