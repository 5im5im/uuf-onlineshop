//package ch.uufstellend.onlineshop;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.annotation.Resource;
//import javax.el.ELContext;
//import javax.el.ELResolver;
//import javax.enterprise.context.RequestScoped;
//import javax.faces.context.FacesContext;
//import javax.inject.Named;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceUnit;
//import javax.transaction.UserTransaction;
//
//import ch.uufstellend.onlineshop.model.Customer;
//import ch.uufstellend.onlineshop.model.Item;
//
//@Named
//@RequestScoped
//public class BuyController implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @PersistenceUnit
//    private EntityManagerFactory emf;
//
//    @Resource
//    private UserTransaction ut;
//
//    public String update(Long id) {
//        FacesContext ctx
//                = FacesContext.getCurrentInstance();
//        ELContext elc = ctx.getELContext();
//        ELResolver elr
//                = ctx.getApplication().getELResolver();
//        SigninController signinController
//                = (SigninController) elr.getValue(
//                        elc, null, "signinController");
//
//        Customer customer = signinController.getCustomer();
//        try {
//            ut.begin();
//            EntityManager em = emf.createEntityManager();
//            Item item = em.find(Item.class, id);
//            item.setBuyer(customer);
//            item.setSold(new Date());
//            em.merge(item);
//            ut.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "/search.jsf";
//    }
//}
