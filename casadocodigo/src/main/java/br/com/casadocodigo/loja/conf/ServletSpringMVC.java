package br.com.casadocodigo.loja.conf;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Essa classe irá servir para configurações básicas.
 * Vai herdar uma classe do Spring, que pega as configurações.
 * AbstractAnnotationConfigDispatcherServletInitializer
 * @author roberto
 *
 */
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Configuração pra conhecer quem são nossos controllers
		return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Mapear o Servlet do Spring pra atender a url mapeada abaixo, no caso a partir do "/"
		return new String[] {"/"};
	}
	
	/**
	 * Resolvendo problema de encoding. dizendo ao Spring que queremos UTF-8
	 */
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}

}
