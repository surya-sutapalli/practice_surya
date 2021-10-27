<%@ page contentType="text/html; charset=ISO-8859-1" import="java.sql.*"%>
<%@ page contentType="text/html; charset=ISO-8859-1"
	import="org.hibernate.Session"%>
<%@ page contentType="text/html; charset=ISO-8859-1"
	import="org.hibernate.SessionFactory"%>
<%@ page contentType="text/html; charset=ISO-8859-1"
	import="org.hibernate.Transaction"%>
<%@ page contentType="text/html; charset=ISO-8859-1"
	import="org.hibernate.cfg.Configuration"%>
<%@ page contentType="text/html; charset=ISO-8859-1" import="java.io.*"%>
<%@ page contentType="text/html; charset=ISO-8859-1" import="com.Policy"%>
<%
String id = request.getParameter("policyid");
int pId = Integer.parseInt(id);
String policyName = request.getParameter("policyname");
Configuration cfg = new Configuration();
String amount = request.getParameter("policyamount");
int pAmount = Integer.parseInt(amount);
String policyDuration = request.getParameter("policyduration");
cfg.configure("hibernate.cfg.xml");
SessionFactory f = cfg.buildSessionFactory();
Session s = f.openSession();
Transaction t = s.beginTransaction();
Policy p = new Policy();
p.setPolicyId(pId);
p.setPolicyName(policyName);
p.setPolicyAmount(pAmount);
p.setPolicyDuration(policyDuration);
s.save(p);
t.commit();
s.close();
f.close();
response.sendRedirect("http://localhost:8080/Demi/policy.html");
response.getWriter().println("<div style=text-align: center;color:white>added policy succesfully</div>");
%>