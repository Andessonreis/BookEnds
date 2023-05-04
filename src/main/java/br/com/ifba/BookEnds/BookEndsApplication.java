package br.com.ifba.BookEnds;

import br.com.ifba.library.view.TelaPrincipal;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"br.com.ifba.library.model", "br.com.ifba.library.view"})
@SpringBootApplication
//@Configuration
//@EnableJpaRepositories("br.com.ifba.library.model")
public class BookEndsApplication { 

	public static void main(String[] args) {
                ConfigurableApplicationContext context = 
                        new SpringApplicationBuilder(BookEndsApplication.class).headless(false).run(args);
                
                TelaPrincipal telaPrincipal = context.getBean(TelaPrincipal.class);
                telaPrincipal.setVisible(true);
	}
}
