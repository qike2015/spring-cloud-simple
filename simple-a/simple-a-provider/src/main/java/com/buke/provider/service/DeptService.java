package com.buke.provider.service;

import com.buke.entity.Dept;

import java.util.List;

/**
 * @author 豆丁
 * @since 2018/12/4
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
