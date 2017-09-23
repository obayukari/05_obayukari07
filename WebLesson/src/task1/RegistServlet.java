package task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)
    		throws ServletException, IOException {



		WordDAO dao = new WordDAO();
		req.setCharacterEncoding("Shift_JIS");



		String english = req.getParameter("english");
		String japanese = req.getParameter("japanese");

		Word words = new Word(english,japanese);
		dao.registWords(words);

		List<Word> setword = new ArrayList<>();
		setword = dao.getWords();

		int wordi=0;

		for(;wordi< setword.size();){
			wordi++;
		}

		req.setAttribute("wordi", wordi);

    	req.getRequestDispatcher("result.jsp").forward(req,res);
	}
}