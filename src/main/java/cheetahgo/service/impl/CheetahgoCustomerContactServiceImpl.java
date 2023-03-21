package cheetahgo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cheetahgo.entity.CheetahgoCustomerContact;
import cheetahgo.service.CheetahgoCustomerContactService;
import cheetahgo.mapper.CheetahgoCustomerContactMapper;
import org.springframework.stereotype.Service;

/**
* @author cm
* @description 针对表【cheetahgo_customer_contact(客户联系人信息表)】的数据库操作Service实现
* @createDate 2023-03-21 15:50:50
*/
@Service
public class CheetahgoCustomerContactServiceImpl extends ServiceImpl<CheetahgoCustomerContactMapper, CheetahgoCustomerContact>
    implements CheetahgoCustomerContactService{

}




