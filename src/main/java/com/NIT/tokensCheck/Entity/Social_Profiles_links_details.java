package com.NIT.tokensCheck.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Social_Profiles_links_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sociallink_id;
    public String githublink;
    public String linkedinlink;
    public String twitterlink;
    public String faceboollink;
}
