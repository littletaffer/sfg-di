package student.springframework.sfsdi.datasource.spring4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DiDataSource implements DataSource {

    private String user;
    private String password;
    private String url;

    public DiDataSource(@Value("${student.sfg.user}") String user,
                        @Value("${student.sfg.password}") String password,
                        @Value("${student.sfg.url}") String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase(){
        return "hello world";
    }

}
