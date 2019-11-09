package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ServiceDao;
import model.Flight;

/**
 * Servlet implementation class Ser
 */
public class Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source=request.getParameter("Source");
		String destination=request.getParameter("Destination");
		System.out.println(source+" "+destination);
		PrintWriter out=response.getWriter();
		Flight flight=new Flight();
		flight.setSource(source);
		flight.setDestination(destination);
		List<Flight> flist=new ServiceDao().getFlight(flight);
		for(Flight ff: flist)
		{
			
			out.println(ff);
			
		}
		
	}

}
