package cheetahgo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cheetahgo.entity.CheetahgoCustomer;
import cheetahgo.service.CheetahgoCustomerService;
import cheetahgo.mapper.CheetahgoCustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author cm
* @description 针对表【cheetahgo_customer(客户表)】的数据库操作Service实现
* @createDate 2023-03-21 15:42:35
*/
@Service
public class CheetahgoCustomerServiceImpl extends ServiceImpl<CheetahgoCustomerMapper, CheetahgoCustomer>
    implements CheetahgoCustomerService{

}




