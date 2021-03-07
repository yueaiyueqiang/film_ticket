package com.film.ticket.service.impl;

import com.film.ticket.entity.Orders;
import com.film.ticket.mapper.OrdersMapper;
import com.film.ticket.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
