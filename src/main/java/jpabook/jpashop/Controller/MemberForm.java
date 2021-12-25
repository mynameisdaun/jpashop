package jpabook.jpashop.Controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "이름은 비어있을 수 없습니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;

}
