package com.vanguard.p2p.utils;

import com.vanguard.p2p.base.domain.User;
import com.vanguard.p2p.base.vo.VerifyCodeVO;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class UserContext {
	public static final String USER_IN_SESSION = "logininfo";//freemark从session取值
	public static final String VERIFYCODE_IN_SESSION = "code";//freemark从session取值

	public static HttpSession getSession (){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
	}

	/**
	 * 将当前用户放入session中
	 * @param currentUser
	 */
	public static void setCurrentUser(User currentUser){
		getSession().setAttribute(UserContext.USER_IN_SESSION, currentUser);
	}

	/**
	 * 从session中移除用户信息
	 */
	public static void removeCurrentUser() {
		getSession().removeAttribute(USER_IN_SESSION);
	}

	/**
	 * 获得当前session中的用户信息
	 * @return
	 */
	public static User getCurrentUser(){
		return (User) getSession().getAttribute(USER_IN_SESSION);
	}


	/**
	 * 将手机验证码存储到session中
	 * @param vo
	 */
	public static void setVerifyCodeVO(VerifyCodeVO vo){
		getSession().setAttribute(VERIFYCODE_IN_SESSION, vo);
	}

	/**
	 * 获得session中的手机验证码
	 * @return
	 */
	public static VerifyCodeVO getVerifyCodeVO() {
		return (VerifyCodeVO) getSession().getAttribute(VERIFYCODE_IN_SESSION);
	}
}
