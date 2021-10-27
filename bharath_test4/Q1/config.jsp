<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String str=	request.getParameter("name");
int upper = 0, lower = 0, number = 0, special = 0;
   for(int i = 0; i < str.length(); i++)
   {
       char ch = str.charAt(i);
       if (ch >= 'A' && ch <= 'Z')
           upper++;
       else if (ch >= 'a' && ch <= 'z')
           lower++;
       else if (ch >= '0' && ch <= '9')
           number++;
       else
           special++;
   }
   response.getWriter().println("<!DOCTYPE html>\r\n"
   		+ "<html lang=\"en\">\r\n"
   		+ "<head>\r\n"
   		+ "    <meta charset=\"UTF-8\">\r\n"
   		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
   		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
   		+ "    <title>Document</title>\r\n"
   		+ "    <link\r\n"
   		+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n"
   		+ "	rel=\"stylesheet\"\r\n"
   		+ "	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n"
   		+ "	crossorigin=\"anonymous\">\r\n");
   response.getWriter().println("<style>\r\n"
   		+ "        #con{\r\n"
   		+ "            margin-left:35%;\r\n"
   		+ "            margin-top: 10%;\r\n"
   		+ "            width: 10cm;\r\n"
   		+ "            height: 6cm;\r\n"
   		+ "            background-color: green;\r\n"
   		+ "            color: white;\r\n"
   		+ "        }\r\n"
   		+ "        body{\r\n"
   		+ "            background-color: black;\r\n"
   		+ "        }\r\n"
   		+ "    </style>");
   response.getWriter().print("<div id=con class=\"card text-white bg-success mb-3\">");
   response.getWriter().println("Lower case letters : " + lower+"<br>");
   response.getWriter().println("Upper case letters : " + upper+"<br>");
   response.getWriter().println("Number : " + number+"<br>");
   response.getWriter().println("Special characters : " + special+"<br>");
   response.getWriter().print("</div>");

%>
</body>
</html>