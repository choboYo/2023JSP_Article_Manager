package com.koreaIT.java.am;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home/printDan")
public class HomeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<div>== 8 ==</div>");
		response.getWriter().append("<div>8 * 1 = 8</div>");
		response.getWriter().append("<div>8 * 2 = 16</div>");
		response.getWriter().append("<div>8 * 3 = 24</div>");
		response.getWriter().append("<div>8 * 4 = 32</div>");
		response.getWriter().append("<div>8 * 5 = 40</div>");
		response.getWriter().append("<div>8 * 6 = 48</div>");
		response.getWriter().append("<div>8 * 7 = 56</div>");
	}

}

