package com.david122.answer.aspect;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.david122.answer.annotation.IgnoreSecurity;
import com.david122.answer.authorization.service.ITokenService;
import com.david122.answer.exception.TokenException;
import com.david122.answer.utils.Constants;
import com.david122.answer.utils.WebContextUtil;

/**
 * Title:安全检查切面(是否登录检查) Description: 通过验证Token维持登录状态
 */
@Component
@Aspect
public class SecurityAspect {

	private static final Logger logger = LogManager.getLogger(SecurityAspect.class);

	@Autowired
	@Qualifier("defaultTokenService")
	private ITokenService tokenService;

	//execution(* com.david122.answer.controller.sayHello(..))切具体的方法
	@Around("execution(* com.david122.answer.controller..*(..)) "
			+ "and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public Object execute(ProceedingJoinPoint pjp) throws Throwable {

		logger.warn("aspect aspect aspect aspect");
		// 从切点上获取目标方法
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		logger.debug("methodSignature : " + methodSignature);
		Method method = methodSignature.getMethod();
		logger.debug("Method : " + method.getName() + " : " + method.isAnnotationPresent(IgnoreSecurity.class));
		// 若目标方法忽略了安全性检查,则直接调用目标方法
		if (method.isAnnotationPresent(IgnoreSecurity.class)) {
			return pjp.proceed();
		}

		// 从 request header 中获取当前 token
		String token = WebContextUtil.getRequest().getHeader(Constants.DEFAULT_TOKEN_NAME);
		// 检查 token 有效性
		if (!tokenService.checkToken(token)) {
			String message = String.format("token [%s] is invalid", token);
			logger.debug("message : " + message);
			throw new TokenException(message);
		}
		// 调用目标方法
		return pjp.proceed();
	}
}
