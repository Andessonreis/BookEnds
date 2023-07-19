package br.com.ifba.BookEnds;

import br.com.ifba.view.TelaPrincipal;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class BookEndsApplication { 

	public static void main(String[] args) {
                ConfigurableApplicationContext context = 
                        new SpringApplicationBuilder(BookEndsApplication.class).headless(false).run(args);
                
                TelaPrincipal telaPrincipal = context.getBean(TelaPrincipal.class);
                telaPrincipal.setVisible(true);
	}
}
