package jp.te4a.spring.boot.myapp11.mybootapp11;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="books")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookBean{
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable =false)
    String title;
    String writter;
    String publisher;
    Integer price;
}