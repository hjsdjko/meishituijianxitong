package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.MeishiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商品订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("meishi_order")
public class MeishiOrderView extends MeishiOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String meishiOrderValue;
	/**
	* 支付类型的值
	*/
	@ColumnInfo(comment="支付类型的字典表值",type="varchar(200)")
	private String meishiOrderPaymentValue;

	//级联表 收货地址
					 
		/**
		* 收货地址 的 创建用户
		*/
		@ColumnInfo(comment="创建用户",type="int(20)")
		private Integer addressYonghuId;
		/**
		* 收货人
		*/

		@ColumnInfo(comment="收货人",type="varchar(200)")
		private String addressName;
		/**
		* 电话
		*/

		@ColumnInfo(comment="电话",type="varchar(200)")
		private String addressPhone;
		/**
		* 地址
		*/

		@ColumnInfo(comment="地址",type="varchar(200)")
		private String addressDizhi;
		/**
		* 是否默认地址
		*/
		@ColumnInfo(comment="是否默认地址",type="int(11)")
		private Integer isdefaultTypes;
			/**
			* 是否默认地址的值
			*/
			@ColumnInfo(comment="是否默认地址的字典表值",type="varchar(200)")
			private String isdefaultValue;
	//级联表 商品
					 
		/**
		* 商品 的 餐厅
		*/
		@ColumnInfo(comment="餐厅",type="int(11)")
		private Integer meishiShangjiaId;
		/**
		* 商品名称
		*/

		@ColumnInfo(comment="商品名称",type="varchar(200)")
		private String meishiName;
		/**
		* 商品编号
		*/

		@ColumnInfo(comment="商品编号",type="varchar(200)")
		private String meishiUuidNumber;
		/**
		* 商品照片
		*/

		@ColumnInfo(comment="商品照片",type="varchar(200)")
		private String meishiPhoto;
		/**
		* 商品类型
		*/
		@ColumnInfo(comment="商品类型",type="int(11)")
		private Integer meishiTypes;
			/**
			* 商品类型的值
			*/
			@ColumnInfo(comment="商品类型的字典表值",type="varchar(200)")
			private String meishiValue;
		/**
		* 商品库存
		*/

		@ColumnInfo(comment="商品库存",type="int(11)")
		private Integer meishiKucunNumber;
		/**
		* 商品原价
		*/
		@ColumnInfo(comment="商品原价",type="decimal(10,2)")
		private Double meishiOldMoney;
		/**
		* 现价
		*/
		@ColumnInfo(comment="现价",type="decimal(10,2)")
		private Double meishiNewMoney;
		/**
		* 商品热度
		*/

		@ColumnInfo(comment="商品热度",type="int(11)")
		private Integer meishiClicknum;
		/**
		* 商品介绍
		*/

		@ColumnInfo(comment="商品介绍",type="longtext")
		private String meishiContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer meishiDelete;
	//级联表 用户
		/**
		* 昵称
		*/

		@ColumnInfo(comment="昵称",type="varchar(200)")
		private String yonghuName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 生日
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="生日",type="date")
		private Date yonghuTime;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;



	public MeishiOrderView() {

	}

	public MeishiOrderView(MeishiOrderEntity meishiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, meishiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getMeishiOrderValue() {
		return meishiOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setMeishiOrderValue(String meishiOrderValue) {
		this.meishiOrderValue = meishiOrderValue;
	}
	//当前表的
	/**
	* 获取： 支付类型的值
	*/
	public String getMeishiOrderPaymentValue() {
		return meishiOrderPaymentValue;
	}
	/**
	* 设置： 支付类型的值
	*/
	public void setMeishiOrderPaymentValue(String meishiOrderPaymentValue) {
		this.meishiOrderPaymentValue = meishiOrderPaymentValue;
	}


	//级联表的get和set 收货地址
		/**
		* 获取：收货地址 的 创建用户
		*/
		public Integer getAddressYonghuId() {
			return addressYonghuId;
		}
		/**
		* 设置：收货地址 的 创建用户
		*/
		public void setAddressYonghuId(Integer addressYonghuId) {
			this.addressYonghuId = addressYonghuId;
		}

		/**
		* 获取： 收货人
		*/
		public String getAddressName() {
			return addressName;
		}
		/**
		* 设置： 收货人
		*/
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}

		/**
		* 获取： 电话
		*/
		public String getAddressPhone() {
			return addressPhone;
		}
		/**
		* 设置： 电话
		*/
		public void setAddressPhone(String addressPhone) {
			this.addressPhone = addressPhone;
		}

		/**
		* 获取： 地址
		*/
		public String getAddressDizhi() {
			return addressDizhi;
		}
		/**
		* 设置： 地址
		*/
		public void setAddressDizhi(String addressDizhi) {
			this.addressDizhi = addressDizhi;
		}
		/**
		* 获取： 是否默认地址
		*/
		public Integer getIsdefaultTypes() {
			return isdefaultTypes;
		}
		/**
		* 设置： 是否默认地址
		*/
		public void setIsdefaultTypes(Integer isdefaultTypes) {
			this.isdefaultTypes = isdefaultTypes;
		}


			/**
			* 获取： 是否默认地址的值
			*/
			public String getIsdefaultValue() {
				return isdefaultValue;
			}
			/**
			* 设置： 是否默认地址的值
			*/
			public void setIsdefaultValue(String isdefaultValue) {
				this.isdefaultValue = isdefaultValue;
			}
	//级联表的get和set 商品
		/**
		* 获取：商品 的 餐厅
		*/
		public Integer getMeishiShangjiaId() {
			return meishiShangjiaId;
		}
		/**
		* 设置：商品 的 餐厅
		*/
		public void setMeishiShangjiaId(Integer meishiShangjiaId) {
			this.meishiShangjiaId = meishiShangjiaId;
		}

		/**
		* 获取： 商品名称
		*/
		public String getMeishiName() {
			return meishiName;
		}
		/**
		* 设置： 商品名称
		*/
		public void setMeishiName(String meishiName) {
			this.meishiName = meishiName;
		}

		/**
		* 获取： 商品编号
		*/
		public String getMeishiUuidNumber() {
			return meishiUuidNumber;
		}
		/**
		* 设置： 商品编号
		*/
		public void setMeishiUuidNumber(String meishiUuidNumber) {
			this.meishiUuidNumber = meishiUuidNumber;
		}

		/**
		* 获取： 商品照片
		*/
		public String getMeishiPhoto() {
			return meishiPhoto;
		}
		/**
		* 设置： 商品照片
		*/
		public void setMeishiPhoto(String meishiPhoto) {
			this.meishiPhoto = meishiPhoto;
		}
		/**
		* 获取： 商品类型
		*/
		public Integer getMeishiTypes() {
			return meishiTypes;
		}
		/**
		* 设置： 商品类型
		*/
		public void setMeishiTypes(Integer meishiTypes) {
			this.meishiTypes = meishiTypes;
		}


			/**
			* 获取： 商品类型的值
			*/
			public String getMeishiValue() {
				return meishiValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setMeishiValue(String meishiValue) {
				this.meishiValue = meishiValue;
			}

		/**
		* 获取： 商品库存
		*/
		public Integer getMeishiKucunNumber() {
			return meishiKucunNumber;
		}
		/**
		* 设置： 商品库存
		*/
		public void setMeishiKucunNumber(Integer meishiKucunNumber) {
			this.meishiKucunNumber = meishiKucunNumber;
		}

		/**
		* 获取： 商品原价
		*/
		public Double getMeishiOldMoney() {
			return meishiOldMoney;
		}
		/**
		* 设置： 商品原价
		*/
		public void setMeishiOldMoney(Double meishiOldMoney) {
			this.meishiOldMoney = meishiOldMoney;
		}

		/**
		* 获取： 现价
		*/
		public Double getMeishiNewMoney() {
			return meishiNewMoney;
		}
		/**
		* 设置： 现价
		*/
		public void setMeishiNewMoney(Double meishiNewMoney) {
			this.meishiNewMoney = meishiNewMoney;
		}

		/**
		* 获取： 商品热度
		*/
		public Integer getMeishiClicknum() {
			return meishiClicknum;
		}
		/**
		* 设置： 商品热度
		*/
		public void setMeishiClicknum(Integer meishiClicknum) {
			this.meishiClicknum = meishiClicknum;
		}

		/**
		* 获取： 商品介绍
		*/
		public String getMeishiContent() {
			return meishiContent;
		}
		/**
		* 设置： 商品介绍
		*/
		public void setMeishiContent(String meishiContent) {
			this.meishiContent = meishiContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getMeishiDelete() {
			return meishiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setMeishiDelete(Integer meishiDelete) {
			this.meishiDelete = meishiDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 昵称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 昵称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 生日
		*/
		public Date getYonghuTime() {
			return yonghuTime;
		}
		/**
		* 设置： 生日
		*/
		public void setYonghuTime(Date yonghuTime) {
			this.yonghuTime = yonghuTime;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}


	@Override
	public String toString() {
		return "MeishiOrderView{" +
			", meishiOrderValue=" + meishiOrderValue +
			", meishiOrderPaymentValue=" + meishiOrderPaymentValue +
			", addressName=" + addressName +
			", addressPhone=" + addressPhone +
			", addressDizhi=" + addressDizhi +
			", meishiName=" + meishiName +
			", meishiUuidNumber=" + meishiUuidNumber +
			", meishiPhoto=" + meishiPhoto +
			", meishiKucunNumber=" + meishiKucunNumber +
			", meishiOldMoney=" + meishiOldMoney +
			", meishiNewMoney=" + meishiNewMoney +
			", meishiClicknum=" + meishiClicknum +
			", meishiContent=" + meishiContent +
			", meishiDelete=" + meishiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", yonghuTime=" + DateUtil.convertString(yonghuTime,"yyyy-MM-dd") +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
