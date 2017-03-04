<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="demo.RemoteInterface" import="java.util.List"
    import="java.util.Properties"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%!
	private static RemoteInterface values;
	public void JspInit(){
	try{
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url ","jnp://localhost:1099/");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		props.setProperty("jboss.naming.client.ejb.context", "true");
		props.setProperty("java.naming.factory.state", "com.sun.cobra.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
		InitialContext ic =new InitialContext(props);
		values=(RemoteInterface)ic.lookup("java:global/EJBStateful/ListElements");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP File</title>
</head>
<body>
<form name="abc"  method="post">
Enter A Number : <input type="text" name="valuea"/><br>
<input type="submit" value="add" name="addNum"/>
<input type="submit" value="remove" name="remNum"/>
<%
if(values!=null){
	List<Integer> nums = values.getElement();
	for(int value:nums){
		out.println(value);
	}
	out.println("size is : "+nums.size());
}
%>
</form>
<%
	if(request.getParameter("addNum")!=null){
		int e =Integer.parseInt(request.getParameter("valuea"));
		System.out.println(values);
	//	values.addElement(e);
	}if(request.getParameter("remNum")!=null){
		int e =Integer.parseInt(request.getParameter("valuea"));
		values.removeElement(e);
	}
%>

</body>
</html>