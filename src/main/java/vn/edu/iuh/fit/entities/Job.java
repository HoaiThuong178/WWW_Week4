package vn.edu.iuh.fit.entities;

import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    private UUID job_id;
    private Company company;
    private String job_desc;
    private String job_name;
}
