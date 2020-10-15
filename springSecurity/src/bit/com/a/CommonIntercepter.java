package bit.com.a;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// 어떤 View라도 접근하려면 거쳐가야 하는 class
public class CommonIntercepter extends HandlerInterceptorAdapter {
	
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
		
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("Intercepter 호출 preHandle URI:" + request.getRequestURI());
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		logger.info("postHandle");
	}

	
	
}





