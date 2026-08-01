package student.springframework.sfsdi.datasource.spring4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("polish")
public class PolishDiDataSource implements DataSource {

    @Override
    public String queryDatabase() {
        return "Witaj świecie";
    }
}
