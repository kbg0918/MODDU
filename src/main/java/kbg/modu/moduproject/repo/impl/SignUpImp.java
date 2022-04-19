package kbg.modu.moduproject.repo.impl;

import kbg.modu.moduproject.domain.Member;
import kbg.modu.moduproject.repo.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SignUp implements SignUpRepository {

    @Autowired
    JdbcTemplate tp;

    @Override
    public void save(Member m) {
        tp.update("insert into member values(?,?)",
                m.getSt_id(), m.getSt_id());
    }
}
