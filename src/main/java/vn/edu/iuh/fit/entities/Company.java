package vn.edu.iuh.fit.entities;

import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    private UUID comp_id;
    private String about;
    private String email;
    private String comp_name;
    private String phone;
    private String web_url;
    private Address address;
}
