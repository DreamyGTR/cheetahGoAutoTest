package cheetahgo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户表
 * @TableName cheetahgo_customer
 */
@TableName(value ="cheetahgo_customer")
@Data
public class CheetahgoCustomer implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客户名
     */
    private String name;

    /**
     * 销售编号
     */
    private Integer salesId;

    /**
     * 所属AMid
     */
    private Integer amId;

    /**
     * 所属优化师id
     */
    private Integer optimizerId;

    /**
     * 客户等级1-9，默认0
     */
    private Integer customerLevel;

    /**
     * 帐户类型 , 1:直客-游戏,2:直客-非游戏,3:渠道
     */
    private Integer accountType;

    /**
     * 白名单 1:否,2:是
     */
    private Integer whiteList;

    /**
     * SAP Code
     */
    private String sapCode;

    /**
     * 状态 1-enabled  2-disabled
     */
    private Integer status;

    /**
     * 是否超额充值 1-是 2-否
     */
    private Integer isOverRecharge;

    /**
     * 操作时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 钱包余额 单位分
     */
    private Long advWallet;

    /**
     * 调用接口的secret
     */
    private String apiSecret;

    /**
     * 报告密码
     */
    private String encryptionKey;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}