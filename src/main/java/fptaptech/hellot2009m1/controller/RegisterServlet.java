package fptaptech.hellot2009m1.controller;

import fptaptech.hellot2009m1.entity.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/account/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html; charset=UTF-8");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String confipassword = req.getParameter("confipassword");
//        String email = req.getParameter("email");
//        String phone = req.getParameter("phone");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = (req.getParameter("birthday"));
        LocalDate date = LocalDate.parse(birthday);
        Account account = new Account();
        account.setUsername(username);
        account.setBirthday(date);
        account.setUsername(username);
        account.setFullName(fullName);
        account.setPhone(phone);
        account.setEmail(email);
        account.setPassword(password);
        req.setAttribute("account", account);
        req.getRequestDispatcher("/account/register-success.jsp").forward(req, resp);


//        resp.getWriter().printf("Acction success , UserName: %s, Email: %s, Phone: %s", username, email,phone);
    }
}
