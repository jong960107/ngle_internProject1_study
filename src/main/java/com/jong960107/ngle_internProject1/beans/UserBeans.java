package com.jong960107.ngle_internProject1.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Valid
public class UserBeans {


    private int user_idx;

    @Pattern(regexp = "^[a-zA-Z\\\\d`~!@#$%^&*()-_=+]{8,24}$")
    @NotBlank
    private String user_email_front;

    @Pattern(regexp = "^[a-zA-Z\\\\d`~!@#$%^&*()-_=+]{8,24}$")
    @Size(min=4, max=20)
    @NotNull
    @NotBlank
    private String user_pw;

    private boolean userIdExist;
    private boolean userLogin;
    public UserBeans() {
        this.userIdExist = false;
        this.userLogin = false;
    }
}
