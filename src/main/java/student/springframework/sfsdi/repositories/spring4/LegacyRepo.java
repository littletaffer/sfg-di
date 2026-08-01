package student.springframework.sfsdi.repositories.spring4;

import student.springframework.sfsdi.datasource.spring2.FakeDataSource;

public class LegacyRepo {

    public String queryDatabase() {
        FakeDataSource store = new FakeDataSource();
        store.setUsername("jt");
        store.setPassword("<PASSWORD>");
        store.setJdbcUrl("jdbc:mysql://localhost:3306/test");

        return store.queryDatabase();
    }

}
