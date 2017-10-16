package Paar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ParametrTest1Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title = "Using POST Method to Read Form Data";
        String docType = "<!doctype html>\n";
        out.println(docType+"<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>First Name</b>:"+
                req.getParameter( "first_name")+"\n"+
                "<li><b> Last Name </b>: "+
                req.getParameter( "last_name")+"\n"+
                "</ul>\n"+
                "</body>\n"+
                "</html>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title = "Using GET Method to Read Form Data";
        String docType = "<!doctype html>\n";
        out.println(docType+"<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>First Name</b>:"+
                req.getParameter( "first_name")+"\n"+
                "<li><b> Last Name </b>: "+
                req.getParameter( "last_name")+"\n"+
                "</ul>\n"+
                "</body>\n"+
                "</html>");

    }
}
