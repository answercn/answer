package com.david122.answer.authorization.service;

/**        
 * Title: REST 鉴权
 * Description: 登录用户的身份鉴权
 */      
public interface ITokenService {

	String createToken(String username);  

    boolean checkToken(String token); 
    
    void deleteToken(String token);
}
