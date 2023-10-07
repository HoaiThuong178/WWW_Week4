package vn.edu.iuh.fit.entities;

import lombok.*;

import java.util.Date;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
    private UUID id;
    private Date dob;
    private String email;
    private String full_name;
    private String phone;
    private Address address;
}
