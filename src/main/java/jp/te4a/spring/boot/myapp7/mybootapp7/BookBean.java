package jp.te4a.spring.boot.myapp7.mybootapp7;
 
import lombok.AllArgsConstructor;
import lombok.Data;
 
@Data//getter・setter自動生成
@AllArgsConstructor
public class BookBean {
    Integer id ;
    String title;
    String writter;
    String publisher;
    Integer price;
}