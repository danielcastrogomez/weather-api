package org.dancas.weatherApp.controllers;

import java.math.BigDecimal;

import org.dancas.weatherApp.model.CurrentWeather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrentWeatherController {

	@GetMapping("/current-weather")
	public String getCurrentWeather(Model model) {
		CurrentWeather currentWeather = new CurrentWeather("Clear", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
		model.addAttribute("currentWeather", currentWeather);
		return "current-weather";
	}
}
