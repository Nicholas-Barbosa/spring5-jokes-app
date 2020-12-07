package guru.springframework.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.service.JokesService;

@Controller
public class JokeController {

	private final JokesService jokeService;

	public JokeController(JokesService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "jokes" })
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());

		return "chucknorris";
	}
}
