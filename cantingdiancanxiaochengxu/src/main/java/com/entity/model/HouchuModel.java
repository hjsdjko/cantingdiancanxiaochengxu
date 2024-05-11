package com.entity.model;

import com.entity.HouchuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 后厨
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HouchuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账号
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 后厨姓名
     */
    private String houchuName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String houchuIdNumber;


    /**
     * 手机号
     */
    private String houchuPhone;


    /**
     * 照片
     */
    private String houchuPhoto;


    /**
     * 假删
     */
    private Integer houchuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账号
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账号
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：后厨姓名
	 */
    public String getHouchuName() {
        return houchuName;
    }


    /**
	 * 设置：后厨姓名
	 */
    public void setHouchuName(String houchuName) {
        this.houchuName = houchuName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getHouchuIdNumber() {
        return houchuIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setHouchuIdNumber(String houchuIdNumber) {
        this.houchuIdNumber = houchuIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getHouchuPhone() {
        return houchuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setHouchuPhone(String houchuPhone) {
        this.houchuPhone = houchuPhone;
    }
    /**
	 * 获取：照片
	 */
    public String getHouchuPhoto() {
        return houchuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setHouchuPhoto(String houchuPhoto) {
        this.houchuPhoto = houchuPhoto;
    }
    /**
	 * 获取：假删
	 */
    public Integer getHouchuDelete() {
        return houchuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setHouchuDelete(Integer houchuDelete) {
        this.houchuDelete = houchuDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
