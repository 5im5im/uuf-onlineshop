//package ch.uufstellend.onlineshop;
//
//import java.io.IOException;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceUnit;
//import javax.persistence.Query;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author Alexander Salvanos
// *
// */
//@WebServlet("/image")
//public class ImageServlet extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    @PersistenceUnit
//    private EntityManagerFactory emf;
//
//    protected void doGet(
//            HttpServletRequest request,
//            HttpServletResponse response)
//            throws ServletException, IOException {
//
//        try {
//            String id
//                    = request.getParameter("id");
//            Query query
//                    = emf.createEntityManager().createQuery(
//                            "select i.foto "
//                            + "from Item i "
//                            + "where i.id = :id");
//            query.setParameter(
//                    "id",
//                    Long.parseLong(id));
//            byte[] foto
//                    = (byte[]) query.getSingleResult();
//            response.reset();
//            response.getOutputStream().write(foto);
//        } catch (Exception ex) {
//            throw new ServletException(ex.getMessage());
//        }
//    }
//}
