package example.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc //Enabling Spring MVC support
public class SpringMvcWebApplicationConfigurer
implements WebMvcConfigurer{
	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("View Resolver is being configured");
		InternalResourceViewResolver viewResolver =
				new InternalResourceViewResolver();
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(suffix);
		return viewResolver;
	}
}







