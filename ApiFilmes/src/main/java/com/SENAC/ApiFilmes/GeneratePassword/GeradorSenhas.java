package com.SENAC.ApiFilmes.GeneratePassword;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenhas {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senhaCriptografada = encoder.encode("ek283msn+_-.;");
        System.out.println(senhaCriptografada);
    }
}
