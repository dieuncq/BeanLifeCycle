package com.example.springboot_beanlifecycle;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepository {
    public Girl findGirlById(int id) {
        return new Girl(id, "Nguyen Thi A", 18);
    }
}
