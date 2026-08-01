package student.springframework.sfsdi.services.spring4;

import student.springframework.sfsdi.repositories.spring4.Repo;

public class DiServiceImpl implements DiService{

    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    @Override
    public String getGreeting() {
        return repo.queryDatabase();
    }
}
