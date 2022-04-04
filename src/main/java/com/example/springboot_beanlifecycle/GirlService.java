package com.example.springboot_beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    public Girl findGirlByUppercaseName(int id) {
        Girl girl = girlRepository.findGirlById(id);
        girl.setName(girl.getName().toUpperCase());
        return girl;
    }
}
