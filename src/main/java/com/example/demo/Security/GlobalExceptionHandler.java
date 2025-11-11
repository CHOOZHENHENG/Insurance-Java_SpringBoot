package com.example.demo.Security;

import com.example.demo.Enums.ResultEnum;
import com.example.demo.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;


public class GlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({IOException.class, RuntimeException.class})
    public Result<?> exception500(Exception ex) {
        return Result.error(ResultEnum.ERROR_500);
    }

    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    @ExceptionHandler(IllegalArgumentException.class)
    public Result<?> exception501(Exception e){
        return Result.error(ResultEnum.ERROR_501);
    }
}
