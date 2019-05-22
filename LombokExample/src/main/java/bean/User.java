package bean;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class User {


    @NonNull
    private String username;
    private String password;


}
