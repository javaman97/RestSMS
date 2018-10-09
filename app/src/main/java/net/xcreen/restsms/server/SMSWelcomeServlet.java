package net.xcreen.restsms.server;

import android.util.Log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SMSWelcomeServlet extends HttpServlet {

    private ServerLogging serverLogging;

    public SMSWelcomeServlet(ServerLogging serverLogging){
        this.serverLogging = serverLogging;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        serverLogging.log("info", "Welcome-Servlet Request /");
        response.getWriter().println("RestSMS-Server is running!");
    }
}
