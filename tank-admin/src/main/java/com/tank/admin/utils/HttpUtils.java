package com.tank.admin.utils;

import com.alibaba.fastjson.JSONObject;
import com.tank.common.emuns.ErrorCode;
import com.tank.common.model.Result;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
  * @description TODO
  * @author lbx
  * @date 2019/11/4 17:19
  * @version 1.0.0
 **/
public class HttpUtils {
    /**
     * 获取HttpServletRequest对象
     * @return
     */
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 输出信息到浏览器
     * @param response
     * @param data
     * @throws IOException
     */
    public static void write(HttpServletResponse response, Object data) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        Result result = new Result();
        result.setData(data);
        result.setErrorCode(ErrorCode.SUCCESS);
        String json = JSONObject.toJSONString(result);
        response.getWriter().print(json);
        response.getWriter().flush();
        response.getWriter().close();
    }
}
