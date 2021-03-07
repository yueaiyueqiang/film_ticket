package com.film.ticket.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.film.ticket.domain.AjaxResult;
import com.film.ticket.entity.Film;
import com.film.ticket.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * @author fufp
 * @since 2021-02-07
 */
@RestController
@RequestMapping("/ticket/film")
public class FilmController {

    @Autowired
    FilmService filmService;

    /**
     * 查询全部电影信息
     * @return
     */
    @RequestMapping("/queryAllFilms")
    public AjaxResult queryAllFilms(){

//        Page<Film> page = new Page<>(pageNum,pageSize);
//        IPage<Map<String,Object>> ipage = filmService.pageMaps(page,null);
//        List<Map<String, Object>> list = ipage.getRecords();

//        IPage<Film> ipage = filmService.page(page,null);
//        List<Film> list = ipage.getRecords();

        return AjaxResult.success(filmService.listMaps(null));
    }

    /**
     * 查询单部电影信息
     */

    @PostMapping("/queryOne")
    public AjaxResult queryOne(@RequestBody Film film){
        QueryWrapper<Film> wrapper = new QueryWrapper<>();
        wrapper.eq("id",film.getId());
        return AjaxResult.success(filmService.getOne(wrapper));
    }

    /**
     * 添加电影信息
     */
    @PostMapping("/insertFilm")
    public AjaxResult insertFilm(@RequestBody Film film){
        filmService.save(film);
        return AjaxResult.success();
    }

    /**
     * 更新电影信息
     */
    @PostMapping("/updateFilm")
    public AjaxResult updateFilm(@RequestBody Film film){
        QueryWrapper<Film> wrapper = new QueryWrapper<>();
        wrapper.eq("id",film.getId());
        filmService.update(film,wrapper);
        return AjaxResult.success();
    }

    /**
     * 删除单个电影信息
     * @param film
     * @return
     */
    @PostMapping("/delFilm")
    public AjaxResult delFilm(@RequestBody Film film){
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("id",film.getId());
        filmService.remove(wrapper);
        return AjaxResult.success();
    }

}

