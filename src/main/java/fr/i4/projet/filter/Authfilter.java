package fr.i4.projet.filter;

import fr.i4.projet.service.TokenCheck;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("*")
public class Authfilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String token = servletRequest.getParameter("token");

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        if( (token != null && TokenCheck.checkToken(token)) || request.getRequestURI().contains("login"))
            filterChain.doFilter(servletRequest, servletResponse);
        else response.setStatus(HttpServletResponse.SC_NOT_FOUND);

    }

    @Override
    public void destroy() {

    }
}
