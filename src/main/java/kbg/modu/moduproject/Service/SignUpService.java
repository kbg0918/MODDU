package kbg.modu.moduproject.Service;

import kbg.modu.moduproject.domain.Member;
import kbg.modu.moduproject.repo.SignUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SignUpService {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    Date time =new Date();
    String localtime = format.format(time);

    @Autowired
    SignUpRepository sr;



    @Transactional
    public void joinSignUp(Member m){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        m.setSt_pw(passwordEncoder.encode(m.getSt_pw()));
        m.setSt_role("Student");
        m.setAdd_date(localtime);
        m.setUp_date(localtime);
        sr.save(m);


    }

}
