package cheetahgo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cheetahgo.entity.CheetahgoCustomerContact;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author cm
 * @description 针对表【cheetahgo_customer_contact(客户联系人信息表)】的数据库操作Mapper
 * @createDate 2023-03-21 15:50:50
 * @Entity cheetahgo.entity.CheetahgoCustomerContact
 */
@Mapper
public interface CheetahgoCustomerContactMapper extends BaseMapper<CheetahgoCustomerContact> {
    int delByCellphone(@Param("cellphone") String cellphone);
}




