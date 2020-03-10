package pt.courses.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import pt.courses.web.config.SpringConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
	return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
	return new String[]{"/"};
    }

}