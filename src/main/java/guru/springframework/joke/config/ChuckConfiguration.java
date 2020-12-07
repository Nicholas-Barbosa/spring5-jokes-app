package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/*
 * Indica que esta classe declara um ou mais @bean e ela pode ser processada pelo spring context para gerar difinicoes de bean e solicitacoes de servicos para esses beans at runtime.
 */
//@Configuration
public class ChuckConfiguration {

	/*
	 * Produzimos um bean a ser gerenciado pelo spring container
	 */
	// @Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
