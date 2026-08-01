package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import student.springframework.sfsdi.datasource.spring4.DataSource;
import student.springframework.sfsdi.datasource.spring4.DiDataSource;
import student.springframework.sfsdi.repositories.spring4.DiRepoImpl;
import student.springframework.sfsdi.repositories.spring4.Repo;
import student.springframework.sfsdi.services.spring4.DiService;

import java.util.HashMap;
import java.util.Map;

public class MimicSpringContextTest {

    public static Map<String, Object> context = new HashMap<>();

    public static void addBean(String beanName, Object bean) {
        context.put(beanName, bean);
    }

    public static Object getBean(String beanName) {
        return context.get(beanName);
    }

    @BeforeAll
    static void beforeAll() {

        addBean("dataStore", new DiDataSource("jt", "1234", "jdbc:mysql://localhost:3306/test"));
        addBean("repo", new DiRepoImpl(
                (DataSource) getBean("dataStore")
        ));
        addBean("diService", new DiService.DiServiceImpl((Repo) getBean("repo")));
        addBean("diController", new DiController((DiService) getBean("diService")));
    }

    @Test
    void getControllerFromContext() {
        DiController controller = (DiController) getBean("diController");
        System.out.println(controller.getGreeting());
    }
}
