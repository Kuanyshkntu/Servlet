package Paar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SesCalc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        int i;
        String title = "Welcome back to my website";
        Map<String,List> sessionMap = (Map<String,List>)req.getServletContext().getAttribute("sesionMap");
        ArrayList<Story> kuanysh = new ArrayList<>();
        ArrayList<String> a1= new ArrayList<>();
        //ArrayList<String> a2= new ArrayList<>();
        //ArrayList<String> a3= new ArrayList<>();
        //ArrayList<String> a4= new ArrayList<>();
        //ArrayList<String> a5= new ArrayList<>();
        Integer visitCount = new Integer(0);
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("ABCD");
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

        if(sessionMap==null){
            sessionMap =new HashMap<String,List>();
        }
        ArrayList<String> listOpreation;

        //kuanysh.add(new Story(a,b,aa,result,"="));
       // session.setAttribute("obj",kuanysh);
        if (session.isNew()){
            title = "Welcome to websitee";
            listOpreation = new ArrayList<String>();
            /*session.setAttribute("0",null);
            session.setAttribute(userIDKey,userID);
            session.setAttribute(visitCountKey,visitCount);*/

            //session.setAttribute(userIDKey,userID);
            //session.setAttribute(visitCountKey,visitCount);
        }
        else {
            listOpreation = (ArrayList<String>)session.getAttribute("jauap");
            /*visitCount = (Integer)session.getAttribute(visitCountKey);
            visitCount+=1;
            kuanysh.add(new Story(a,b,aa,result,"="));

            session.setAttribute("0",kuanysh);*/
        }
        listOpreation.add(a+""+aa+""+b+"="+result);
        session.setAttribute("jauap",listOpreation);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //String title = "Using POST Method to Read Form Data";
        String docType = "<!doctype html>\n";
        out.println(docType+"<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>Jauaby</b>:"+"\n");
        for(String oper:listOpreation){
            out.println(
                    "<li><b>Istoria</b>"+oper+"\n"

            );

        }
        sessionMap.put(session.getId(),listOpreation);
        getServletContext().setAttribute("sesionMap",sessionMap);

        out.println(
                "</ul>\n"+
                "</body>\n"+
                "</html>");
    }
}
