package com.johuer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> </p>
 *
 * @author xujiuhua
 * @version 1.0
 * @since JDK 1.7
 */

@Controller
@RequestMapping("user")
@Api(tags = {"user"}, description = "user控制层描述")
public class UserController {

    @ApiOperation(value = "入参字符串", notes = "传入一个字符串")
    @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "string", paramType = "query")
    @RequestMapping(value = "testStr", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> testStr(String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        return map;
    }

}
