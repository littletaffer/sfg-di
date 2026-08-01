package student.springframework.sfsdi.datasource.spring4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class SpanishDiDataSource implements DataSource {

    @Override
    public String queryDatabase() {
        return "Hola Mundo";
    }
}
