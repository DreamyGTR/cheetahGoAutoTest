package cheetahgo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import cheetahgo.entity.CheetahgoCustomerCooperateClient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author cm
* @description 针对表【cheetahgo_customer_cooperate_client(合作管理委托方表)】的数据库操作Mapper
* @createDate 2023-03-16 11:04:25
* @Entity cheetahgo.entity.CheetahgoCustomerCooperateClient
*/
public interface CheetahgoCustomerCooperateClientMapper extends BaseMapper<CheetahgoCustomerCooperateClient> {
    int insertSelective(CheetahgoCustomerCooperateClient cheetahgoCustomerCooperateClient);

    int deleteById(@Param("id") Long id);

    List<CheetahgoCustomerCooperateClient> selectAll();
}




