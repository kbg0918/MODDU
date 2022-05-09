package kbg.modu.moduproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private int seq;
    private String St_id;
    private String St_pw;
    private String St_name;
    private String St_email;
    private String St_role;
    private String add_date;
    private String up_date;
}

