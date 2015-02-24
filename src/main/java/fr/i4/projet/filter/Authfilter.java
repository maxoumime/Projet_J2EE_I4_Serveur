package fr.i4.projet.filter;

import fr.i4.projet.listener.MainListener;
import fr.i4.projet.service.TokenCheck;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/rest/*")
public class Authfilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String token = request.getParameter("token");

        //System.out.println(token);

        if(token == null)
            token = request.getRequestURI().replaceAll("^.*token=", "");

        //System.out.println(token);

        if( (token != null && TokenCheck.checkToken(token)) || request.getRequestURI().contains("login"))
            filterChain.doFilter(servletRequest, servletResponse);
        else {
            //response.getWriter().append(MainListener.getListProduits().toString());
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }

    public void destroy() {

    }
}
