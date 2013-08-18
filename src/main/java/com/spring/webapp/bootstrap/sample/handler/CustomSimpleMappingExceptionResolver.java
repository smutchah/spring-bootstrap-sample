package com.spring.webapp.bootstrap.sample.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class CustomSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	private static final Logger log = LoggerFactory.getLogger(CustomSimpleMappingExceptionResolver.class);

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) {
		ModelAndView modelAndView = super.doResolveException(request, response, handler, ex);
		
		for (Map.Entry<String, String[]> map : request.getParameterMap().entrySet()) {
			log.warn("map: " + map.getKey());
		}
		
		log.error("custom");
		
		return modelAndView;
	}

}
