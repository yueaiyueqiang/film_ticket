package com.film.ticket.service.impl;

import com.film.ticket.entity.Film;
import com.film.ticket.mapper.FilmMapper;
import com.film.ticket.service.FilmService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fufp
 * @since 2021-02-07
 */
@Service
public class FilmServiceImpl extends ServiceImpl<FilmMapper, Film> implements FilmService {

}
