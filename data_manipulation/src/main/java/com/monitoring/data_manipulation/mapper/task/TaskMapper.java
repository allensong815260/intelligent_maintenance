package com.monitoring.data_manipulation.mapper.task;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monitoring.data_manipulation.entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wyx
 * @since 2019-07-25
 */
@Mapper
@Component
public interface TaskMapper extends BaseMapper<Task> {

    boolean updateCronById(@Param("id") Integer id, @Param("cron") String cron);

    IPage<Task> selectAll(Page page);

}
