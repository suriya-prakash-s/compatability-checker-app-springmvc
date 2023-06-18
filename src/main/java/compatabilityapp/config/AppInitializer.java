package compatabilityapp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer /*implements WebApplicationInitializer*/ {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass = {AppConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/compatabilityapp.com/*"};
		return mapping;
	}

//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// creating container and registering the config class in the container
//		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(AppConfig.class);
//
//		// create dispatcher servlet
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//
//		// register dispatcher servlet with servletcontext
//		ServletRegistration.Dynamic appDispatcherServlet = servletContext.addServlet("appDispatcherServlet",
//				dispatcherServlet);
//
//		// add dispatcher servlet props
//		appDispatcherServlet.setLoadOnStartup(1);
//		appDispatcherServlet.addMapping("/compatabilityapp.com/*");
//
//	}

}
