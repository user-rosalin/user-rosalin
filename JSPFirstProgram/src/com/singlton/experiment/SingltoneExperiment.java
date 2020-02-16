package com.singlton.experiment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/requrl")
public class SingltoneExperiment extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ENTERED IN TO SERVICE METHOD");
		List<String> cities=new ArrayList<String>();
		cities.add("abc");
		cities.add("cde");
		cities.add("fgh");
		cities.add("ijk");
		req.setAttribute( "city",cities);
		System.out.println("ENTERED IN TO SERVICE METHOD"+req.getAttribute("city"));
		req.getRequestDispatcher( "/newpage.jsp").forward( req, resp);
		System.out.println(req);
		
	}

}
