package com.hu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.reggie.dto.SetmealDto;
import com.hu.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);
}
