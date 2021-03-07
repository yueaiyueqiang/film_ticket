package com.film.ticket.service.impl;

import com.film.ticket.entity.Users;
import com.film.ticket.mapper.UsersMapper;
import com.film.ticket.service.UsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
