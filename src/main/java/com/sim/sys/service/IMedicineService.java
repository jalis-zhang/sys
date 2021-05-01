package com.sim.sys.service;

import com.sim.sys.entity.Medicine;
import com.sim.sys.entity.Result;

import java.util.List;

/**
 * (TbMedicine)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:00
 */
public interface IMedicineService {

    /**
     * 通过ID查询单条数据
     *
     * @param medicineId 主键
     * @return 实例对象
     */
    Medicine queryById(String medicineId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Medicine> queryAllByLimit(int offset, int limit);

    List<Medicine> queryExpiredMedicine();

    /**
     * 新增数据
     *
     * @param medicine 实例对象
     * @return 实例对象
     */
    Result insert(Medicine medicine);

    /**
     * 修改数据
     *
     * @param medicine 实例对象
     * @return 实例对象
     */
    Medicine update(Medicine medicine);

    /**
     * 通过主键删除数据
     *
     * @param medicineId 主键
     * @return 是否成功
     */
    boolean deleteById(String medicineId);

    /**
     * 查询药品数量
     * @param medicineId
     * @return
     */
    public int queryNumById(String medicineId);



}