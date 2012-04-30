package com.ynujc.totalization.servlet;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynujc.totalization.jdo.Jansi;
import com.ynujc.totalization.util.PMF;

public class ListMemberServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		String query = "select from " + Jansi.class.getName();
		Object memberList = pm.newQuery(query).execute();
		req.setAttribute("memberList", memberList);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}
