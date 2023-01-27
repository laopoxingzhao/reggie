package com.hu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.reggie.dto.SetmealDto;
import com.hu.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
