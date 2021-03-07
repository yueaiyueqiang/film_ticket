package com.film.ticket.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fufp
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "film_detail")
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String fname;

    private String director;

    private String actor;

    private String type;

    private String language;

    private Integer length;

    private String country;

    private String time;

    private Float price;

    private String image;

    private String introduction;

    private Integer code;

    @TableField(fill = FieldFill.INSERT)
    private Date addtime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatetime;

    private Integer status;

    @TableLogic
    @TableField("isDelete")
    private Integer isDelete;


}
