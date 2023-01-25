package com.hu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.reggie.dto.DishDto;
import com.hu.reggie.entity.Dish;
import lombok.extern.slf4j.Slf4j;

public interface DishService extends IService<Dish> {

    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
