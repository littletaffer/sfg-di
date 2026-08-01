package student.springframework.sfsdi.repositories.spring4;

import org.springframework.stereotype.Component;
import student.springframework.sfsdi.datasource.spring4.DataSource;

@Component
public class DiRepoImpl implements Repo {

    private DataSource source;

    public DiRepoImpl(DataSource source) {
        this.source = source;
    }

    @Override
    public String queryDatabase() {
        return source.queryDatabase();
    }
}
