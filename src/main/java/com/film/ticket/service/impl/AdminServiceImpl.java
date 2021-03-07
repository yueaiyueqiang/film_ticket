package com.film.ticket.service.impl;

import com.film.ticket.entity.Admin;
import com.film.ticket.mapper.AdminMapper;
import com.film.ticket.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
