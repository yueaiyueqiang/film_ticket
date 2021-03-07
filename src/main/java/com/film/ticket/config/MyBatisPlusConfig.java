package com.film.ticket.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
@Configuration
public class MyBatisPlusConfig {


//        @Bean
//        public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor(){
//            return new OptimisticLockerInnerInterceptor();
//        }

        @Bean
        public PaginationInterceptor paginationInterceptor(){
            // 分页插件，如果你不配置，分页插件将不生效
            // 指定数据库方言为 MYSQL
            PaginationInterceptor pageInterceptor = new PaginationInterceptor();
            pageInterceptor.setDialectType("MYSQL");
            return pageInterceptor;
        }




    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

}
