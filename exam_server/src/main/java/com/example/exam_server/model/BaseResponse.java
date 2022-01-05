package com.example.exam_server.model;

import java.util.List;

public class BaseResponse<T> {
    public int code = 1;
    public String message = "Success";
    public T data;
    public List<T> datas;
}
