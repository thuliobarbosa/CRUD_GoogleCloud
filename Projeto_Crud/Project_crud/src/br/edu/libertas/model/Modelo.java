package br.edu.libertas.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Modelo {
	
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
