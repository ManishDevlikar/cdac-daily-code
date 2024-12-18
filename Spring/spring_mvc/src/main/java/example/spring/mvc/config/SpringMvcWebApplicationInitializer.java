package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringMvcWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext appCtx) throws ServletException {
		System.out.println("Application is starting up....");
		AnnotationConfigWebApplicationContext webAppCtx = new AnnotationConfigWebApplicationContext();

		webAppCtx.setConfigLocation("example");
		// The above statement is equivalent to @ComponentScan(basePackages =
		// "example"))
		DispatcherServlet frontControllerServlet = new DispatcherServlet(webAppCtx);

		ServletRegistration.Dynamic registration = appCtx.addServlet("frontController", frontControllerServlet);
		registration.addMapping("/");// It accepts all the incoming requests.

	}

}
