package org.example.one;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDateTime userActiveTime;

}
