package co.craft.testtask.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

/**
 * Created by ylauresh on 6/30/16.
 */
public class TaskWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {TaskConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/api/*"};
    }

    @Override
    protected Filter[] getServletFilters() {
        Filter[] singleton = { new CORSFilter()};
        return singleton;
    }
}
