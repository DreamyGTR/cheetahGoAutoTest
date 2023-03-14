package cheetahgo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cheetahgo_customer_cooperate_client")
public class Cheetahgo_Customer_Cooperate_Client {
    public int id;
    public String name;
    public String create_date;
    public String update_date;
}
