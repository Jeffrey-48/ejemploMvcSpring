package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario.jsp";
	}
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring.jsp";
	}
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model model) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre , Model model) {
		nombre+=" es el mejor alumno";
		String mensajeFinal = "¿Quien es el mejor alumno?" + nombre;
		model.addAttribute("mensajeClaro", mensajeFinal);
		return "HolaAlumnosSpring.jsp";
	}
}
