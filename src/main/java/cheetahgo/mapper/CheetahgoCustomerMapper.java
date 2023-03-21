package cheetahgo.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cheetahgo.entity.CheetahgoCustomer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cm
 * @description 针对表【cheetahgo_customer(客户表)】的数据库操作Mapper
 * @createDate 2023-03-21 15:42:35
 * @Entity cheetahgo.entity.CheetahgoCustomer
 */
@Mapper
public interface CheetahgoCustomerMapper extends BaseMapper<CheetahgoCustomer> {
    int deleteByName(@Param("name") String name);

    List<CheetahgoCustomer> selectByName(@Param("name") String name);
}




