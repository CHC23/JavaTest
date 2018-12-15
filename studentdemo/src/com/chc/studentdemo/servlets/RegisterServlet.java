package com.chc.studentdemo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.service.IStudentService;
import com.chc.studentdemo.service.StudentServiceImpl;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//��ȡ������
		String number=request.getParameter("number");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String ageStr=request.getParameter("age");
		String scoreStr=request.getParameter("score");
		String sex=request.getParameter("sex");
		
		Integer age = Integer.valueOf(ageStr);
		Double score = Double.valueOf(scoreStr);
		
		if(number==null||"".equals(number.trim())) {
			//session.setAttribute("message","ѧ���������");
			//��Ϊ�ջ���δͨ�������룬ʹ������ת��,������ˢ��ʱ��ռ����Դ�� ���ʹ���ض���,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//����student����
		Student student=new Student(number,password,name,age,score,sex);
		student.setNumber(number);
		student.setPassword(password);
		student.setName(name);
		student.setAge(age);
		student.setScore(score);
		student.setSex(sex);
		
		//����service����
		IStudentService service=new StudentServiceImpl();
		
		//����service�����saveStudent()������д�����ݿ�
		Integer id=service.saveStudent(student);
		//д��ʧ����תע��ҳ������ע��,�����ݿ��е�idΪ��ʱ������û��д�����ݿ�
		if(id==null) {
			response.sendRedirect(request.getContextPath() + "/register.jsp");
		}
		//д��ɹ�����ת��¼ҳ
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}


}
