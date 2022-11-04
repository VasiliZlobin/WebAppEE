import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Products", urlPatterns = "/products")
public class ProductsPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<html><body>");
        for (int i = 1; i < 11; i++) {
            resp.getWriter().printf("<h1>%s</h1><br>", new Product(i, String.format("Товар №%d", i), Math.round(Math.random() * 100)));
        }
        resp.getWriter().println("</body></html>");
    }
}
