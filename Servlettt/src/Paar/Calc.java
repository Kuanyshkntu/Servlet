package Paar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calc extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title = "Kuanysh Get";
        String docType = "<!doctype html>\n";



        out.println(docType+"<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>Jauaby</b>:");
        String a = req.getParameter( "first_number");
        String b = req.getParameter( "second_number");
        String c = req.getParameter("oper");
        float _a=Float.parseFloat(a);
        float _b=Float.parseFloat(b);
        float res=0;
        String aa="jok";
        if(c.equals("k")){
            res=_a+_b;
            aa="+";
        }
        else if (c.equals("a")){
            res=_a-_b;
            aa="-";
        }
        else if (c.equals("kk")){
            res=_a*_b;
            aa="*";
        }
        else if (c.equals("b")){
            res=_a/_b;
            aa="/";
        }
        String result=String.valueOf(res);
        out.println(a+aa+b+"="+


        result+"\n"+

                "</ul>\n"+
                "</body>\n"+
                "</html>");

    }
}