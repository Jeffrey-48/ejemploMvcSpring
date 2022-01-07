package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class errorControladorRepetido {
	
	//provoca error ambiguo debido a que ya se esta mapeando esta ruta
	//la solucion es especificar una ruta relativa en el controlador con requestMapping
	@RequestMapping("/procesarFormulario2")
	// public String otroProcesoFormulario(HttpServletRequest request, Model model)
	// {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model model) {
		nombre += " es el peor alumno";
		String mensajeFinal = "¿Quien es el peor alumno?" + nombre;
		model.addAttribute("mensajeClaro", mensajeFinal);
		return "HolaAlumnosSpring.jsp";
	}
}
