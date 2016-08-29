package com.applix.webapp.servlet;

import com.applix.webapp.helper.Calculator;
import com.applix.webapp.helper.Validator;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
@WebServlet("/addNumbers")
public class AddNumbers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        boolean allValuesNumeric = true;
        boolean operatorValid = false;
        int i;
        Iterator itrParameters;
        Long[] values = new Long[2];
        Long finalValue = null;
        Map mapParameters = request.getParameterMap();
        Set setParameters = mapParameters.keySet();
        String parameterName;
        String[] arrParameterValues = new String[2];
        String operator = null;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddNumbers</title>");            
            out.println("</head>");
            out.println("<body>");
            itrParameters= setParameters.iterator();
            i = 0;
            while(itrParameters.hasNext())  {
                parameterName = (String) itrParameters.next();
                out.println("<p>" + "param name =" + parameterName + ": ");
                arrParameterValues = (String[])mapParameters.get(parameterName);
                out.println("param value = " + arrParameterValues[0] + " ");
                if(i==0) {
                    values[0] = Validator.isThisANumber(arrParameterValues[0]);
                }
                if(i==1) {
                    if(Validator.isThisAValidOperator(arrParameterValues[0])) {
                        operator = arrParameterValues[0];
                    }
                    else {
                        operatorValid = false;
                    }
                }
                if(i==2) {
                    values[1] = Validator.isThisANumber(arrParameterValues[0]);
                }
                i++;
                out.println("</p>");
            }
            for (Long value : values) {
                if (value == -1) {
                    allValuesNumeric = false;
                    break;
                }
            }
            if(
                (allValuesNumeric && operatorValid)
              ) {
                finalValue = Calculator.calculate(values[0], operator, values[1]);
                out.println("<p>Result: " + finalValue + "</p>");
            }
            else {
                out.println("<p>One or more values was/were non-numeric, or, the operator was invalid");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
