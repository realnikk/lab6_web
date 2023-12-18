import org.example.hibLab.authorization.LogIn;
import org.example.hibLab.dao.daoImpl.CompanyDaoImpl;
import org.example.hibLab.dao.daoImpl.PersonDaoImpl;
import org.example.hibLab.entity.Company;
import org.example.hibLab.entity.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HibTest {
    PersonDaoImpl pdi;
    CompanyDaoImpl cdi;

    @BeforeEach
    public void setUp(){
        pdi = new PersonDaoImpl();
        cdi = new CompanyDaoImpl();
    }

    @Test
    public void authTest(){
        String login = "realnik";
        String pass = "mjavaga2023";
        LogIn logIn = new LogIn();
        int res = logIn.authorizationForTest(login, pass);
        assertEquals(1, res);
    }

    @Test
    public void showPersonTable(){
        try {
            List<Person> list = pdi.showPeople();
            assertNotNull(list);
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void addCompanyToDb(){
        Company com = new Company("Volvo", "Sweden");
        try {
            boolean successed = cdi.addCompany(com);
            assertTrue(successed);
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void deleteCompanyFromDb(){
        List<Company> list = cdi.showCompanies();
        Company lastCom = list.get(list.size() - 1);
        try {
            boolean isDeleted = cdi.deleteCompany(lastCom.getCompanyId());
            assertTrue(isDeleted);
        } catch (NoClassDefFoundError e){
            fail();
        }
    }

    @Test
    public void findPersonByIdd(){
        Person person;
        try {
            person = pdi.findPersonById(1);
            assertNotNull(person);
        } catch (NoClassDefFoundError e){
            fail();
        }
    }
}
