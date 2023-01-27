package com.hu.reggie.dto;

import com.hu.reggie.entity.Setmeal;
import com.hu.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
