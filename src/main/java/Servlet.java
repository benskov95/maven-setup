import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("Så er der hul igennem til servletten via post. Hej " + request.getParameter("name"));

        String navn = request.getParameter("name");
        System.out.println(navn);
        request.setAttribute("Navn", navn);

        List<String> liste = new ArrayList<>();
        liste.add("John");
        liste.add("Anne");
        liste.add("Anne");
        liste.add("Anne");
        liste.add("Erik");
        liste.add("Sigurd");

        request.setAttribute("liste", liste);

        Map<String, String> map = new HashMap<>();
        map.put("John", "58");
        map.put("Anne", "33");
        map.put("Erik", "29");
        map.put("Sigurd", "75");

        request.setAttribute("map", map);

        Set<String> set = new HashSet<>(liste);
        request.setAttribute("set", set);

        request.getRequestDispatcher("Velkommen.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("Så er der hul igennem til servletten via get. Hej " + request.getParameter("name"));

    }
}
