package com.sim.sys.dao;

import com.sim.sys.entity.TbPharmacist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbPharmacist)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-20 09:46:34
 */
public interface TbPharmacistDao {

    TbPharmacist  verifyUser(String account,String password);

    /**
     * 通过ID查询单条数据
     *
     * @param pharmacistId 主键
     * @return 实例对象
     */
    TbPharmacist queryById(String pharmacistId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbPharmacist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbPharmacist 实例对象
     * @return 对象列表
     */
    List<TbPharmacist> queryAll(TbPharmacist tbPharmacist);

    /**
     * 新增数据
     *
     * @param tbPharmacist 实例对象
     * @return 影响行数
     */
    int insert(TbPharmacist tbPharmacist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbPharmacist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbPharmacist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbPharmacist> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbPharmacist> entities);

    /**
     * 修改数据
     *
     * @param tbPharmacist 实例对象
     * @return 影响行数
     */
    int update(TbPharmacist tbPharmacist);

    /**
     * 通过主键删除数据
     *
     * @param pharmacistId 主键
     * @return 影响行数
     */
    int deleteById(String pharmacistId);

}

