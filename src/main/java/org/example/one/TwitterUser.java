package org.example.one;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TwitterUser {
    private String userMail;
    private String userCountry;
    private LocalDateTime userActiveTime;
}
