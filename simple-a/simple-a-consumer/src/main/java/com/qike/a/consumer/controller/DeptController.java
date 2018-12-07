package com.qike.a.consumer.controller;

import com.buke.entity.Dept;
import com.buke.service.DeptClinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 豆丁
 * @since 2018/12/5
 */
@RestController
public class DeptController {

    @Autowired
    private DeptClinetService deptClinetService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptClinetService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClinetService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClinetService.list();
    }

    @GetMapping(value = "/consumer/port")
    public Object port() {
        return deptClinetService.port();
    }

}
