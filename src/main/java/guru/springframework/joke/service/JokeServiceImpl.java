package guru.springframework.joke.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokesService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {

		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
