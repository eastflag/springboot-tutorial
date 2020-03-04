package kr.co.eastflag.config.jwt;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//need default constructor for JSON Parsing
@NoArgsConstructor
@Data
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;
}
