import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

/**
 * Created by cube on 28.12.2017.
 */
public class Game extends HttpServlet {

    private static int randomNumber = new Random().nextInt(10);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JSONStreamAware response;
        JSONObject result = new JSONObject();
        int number = Integer.parseInt(req.getParameter("number"));
        result.put("result", number == randomNumber?"COOL!!!":"NOPE!!!");
        response = result;
        try (Writer writer = resp.getWriter()) {
            response.writeJSONString(writer);
        }
    }
}
