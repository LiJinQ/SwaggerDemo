package com.ljq.swagger_demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author LJQ E-mail:jinquan.li@ambow.com
 * @version 1.0
 * @date 创建时间：2018/12/20 17:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(description= "测试实体类")
public class TestVo {

    @ApiModelProperty(value = "字符型")
    private String name;

    @ApiModelProperty(value = "浮点型")
    private Float amount;

}
