package com.ljq.swagger_demo.controller;

import com.ljq.swagger_demo.vo.TestVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author LJQ E-mail:jinquan.li@ambow.com
 * @version 1.0
 * @date 创建时间：2018/12/20 17:44
 * @parameter
 * @return
 * @since
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试接口")
public class TestController {

    @PostMapping
    @ApiOperation(value = "post方式接口")
    @ApiResponses(value = {
            @ApiResponse( code = 200 ,message = "success",response = com.ljq.swagger_demo.vo.TestVo.class)
    })
    public TestVo test1(@RequestBody TestVo testVo){
        return testVo;
    }

    @GetMapping
    @ApiOperation(value = "get方式接口")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "name",value = "字符型",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "amount",value = "浮点型",paramType = "query",dataType = "Float")
    })
    @ApiResponses(value = {
            @ApiResponse( code = 200 ,message = "success",response = com.ljq.swagger_demo.vo.TestVo.class)
    })
    public TestVo test2(@RequestParam("name")String name,
                        @RequestParam("amount")Float amount){
        return new TestVo(name,amount);
    }
}
