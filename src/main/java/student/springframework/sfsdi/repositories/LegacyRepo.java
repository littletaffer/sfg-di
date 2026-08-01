package student.springframework.sfsdi.repositories;

import student.springframework.sfsdi.datasource.FakeDataSource;

public class LegacyRepo {

    public String queryDatabase() {
        FakeDataSource store = new FakeDataSource();
        store.setUsername("jt");
        store.setPassword("<PASSWORD>");
        store.setJdbcUrl("jdbc:mysql://localhost:3306/test");

        return store.queryDatabase();
    }


}
