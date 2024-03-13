package vn.edu.iuh.fit.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    @Field
    private String phone;
    @Field
    private String name;
    @Field
    private String hashPass;
    @Field
    private String avatar;
    @Field
    private List<String> friends;

    public User(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }
}
