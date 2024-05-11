package com.entity.vo;

import com.entity.HouchuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 后厨
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("houchu")
public class HouchuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账号
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 后厨姓名
     */

    @TableField(value = "houchu_name")
    private String houchuName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份证号
     */

    @TableField(value = "houchu_id_number")
    private String houchuIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "houchu_phone")
    private String houchuPhone;


    /**
     * 照片
     */

    @TableField(value = "houchu_photo")
    private String houchuPhoto;


    /**
     * 假删
     */

    @TableField(value = "houchu_delete")
    private Integer houchuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账号
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账号
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：后厨姓名
	 */
    public String getHouchuName() {
        return houchuName;
    }


    /**
	 * 获取：后厨姓名
	 */

    public void setHouchuName(String houchuName) {
        this.houchuName = houchuName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getHouchuIdNumber() {
        return houchuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setHouchuIdNumber(String houchuIdNumber) {
        this.houchuIdNumber = houchuIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getHouchuPhone() {
        return houchuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setHouchuPhone(String houchuPhone) {
        this.houchuPhone = houchuPhone;
    }
    /**
	 * 设置：照片
	 */
    public String getHouchuPhoto() {
        return houchuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setHouchuPhoto(String houchuPhoto) {
        this.houchuPhoto = houchuPhoto;
    }
    /**
	 * 设置：假删
	 */
    public Integer getHouchuDelete() {
        return houchuDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setHouchuDelete(Integer houchuDelete) {
        this.houchuDelete = houchuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
