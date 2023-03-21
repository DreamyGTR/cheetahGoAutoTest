package cheetahgo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户联系人信息表
 * @TableName cheetahgo_customer_contact
 */
@TableName(value ="cheetahgo_customer_contact")
@Data
public class CheetahgoCustomerContact implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String cellphone;

    /**
     * 加密后的手机号
     */
    private String cellphoneEncrypted;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 加密后的邮箱
     */
    private String emailEncrypted;

    /**
     * 优先级  1,2 默认1 
     */
    private Integer priority;

    /**
     * 邮件订阅  1-周报 2-月报
     */
    private String mailType;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}