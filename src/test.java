
import dto.Employee;
import dto.contract_emp;
import dto.per_emp;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setName("anjal");
        
        contract_emp c1 = new contract_emp();
        c1.setName("Amit");
        c1.setDays(20);
        c1.setWorkng_hr(8);
        
        per_emp p1 = new per_emp();
        p1.setName("Shreya");
        p1.setBonus(30888);
        p1.setSal(5000000);
        
        s.save(e1);
        s.save(c1);
        s.save(p1);
        
        t.commit();
        s.close();
        sf.close();
        
}
}
