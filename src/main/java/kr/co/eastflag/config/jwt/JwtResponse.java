package kr.co.eastflag.config.jwt;

import lombok.Getter;

@Getter
public class JwtResponse {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }
}
