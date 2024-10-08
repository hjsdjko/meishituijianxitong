package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商品
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("meishi")
public class MeishiView extends MeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 商品类型的值
	*/
	@ColumnInfo(comment="商品类型的字典表值",type="varchar(200)")
	private String meishiValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;

	//级联表 餐厅
		/**
		* 餐厅名称
		*/

		@ColumnInfo(comment="餐厅名称",type="varchar(200)")
		private String shangjiaName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String shangjiaPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String shangjiaEmail;
		/**
		* 营业执照展示
		*/

		@ColumnInfo(comment="营业执照展示",type="varchar(200)")
		private String shangjiaPhoto;
		/**
		* 餐厅地址
		*/

		@ColumnInfo(comment="餐厅地址",type="varchar(200)")
		private String shangjiaAddress;
		/**
		* 餐厅类型
		*/
		@ColumnInfo(comment="餐厅类型",type="int(11)")
		private Integer shangjiaTypes;
			/**
			* 餐厅类型的值
			*/
			@ColumnInfo(comment="餐厅类型的字典表值",type="varchar(200)")
			private String shangjiaValue;
		/**
		* 现有余额
		*/
		@ColumnInfo(comment="现有余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 餐厅介绍
		*/

		@ColumnInfo(comment="餐厅介绍",type="longtext")
		private String shangjiaContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer shangjiaDelete;



	public MeishiView() {

	}

	public MeishiView(MeishiEntity meishiEntity) {
		try {
			BeanUtils.copyProperties(this, meishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
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
	//当前表的
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


	//级联表的get和set 餐厅

		/**
		* 获取： 餐厅名称
		*/
		public String getShangjiaName() {
			return shangjiaName;
		}
		/**
		* 设置： 餐厅名称
		*/
		public void setShangjiaName(String shangjiaName) {
			this.shangjiaName = shangjiaName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getShangjiaPhone() {
			return shangjiaPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setShangjiaPhone(String shangjiaPhone) {
			this.shangjiaPhone = shangjiaPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getShangjiaEmail() {
			return shangjiaEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setShangjiaEmail(String shangjiaEmail) {
			this.shangjiaEmail = shangjiaEmail;
		}

		/**
		* 获取： 营业执照展示
		*/
		public String getShangjiaPhoto() {
			return shangjiaPhoto;
		}
		/**
		* 设置： 营业执照展示
		*/
		public void setShangjiaPhoto(String shangjiaPhoto) {
			this.shangjiaPhoto = shangjiaPhoto;
		}

		/**
		* 获取： 餐厅地址
		*/
		public String getShangjiaAddress() {
			return shangjiaAddress;
		}
		/**
		* 设置： 餐厅地址
		*/
		public void setShangjiaAddress(String shangjiaAddress) {
			this.shangjiaAddress = shangjiaAddress;
		}
		/**
		* 获取： 餐厅类型
		*/
		public Integer getShangjiaTypes() {
			return shangjiaTypes;
		}
		/**
		* 设置： 餐厅类型
		*/
		public void setShangjiaTypes(Integer shangjiaTypes) {
			this.shangjiaTypes = shangjiaTypes;
		}


			/**
			* 获取： 餐厅类型的值
			*/
			public String getShangjiaValue() {
				return shangjiaValue;
			}
			/**
			* 设置： 餐厅类型的值
			*/
			public void setShangjiaValue(String shangjiaValue) {
				this.shangjiaValue = shangjiaValue;
			}

		/**
		* 获取： 现有余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 现有余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 餐厅介绍
		*/
		public String getShangjiaContent() {
			return shangjiaContent;
		}
		/**
		* 设置： 餐厅介绍
		*/
		public void setShangjiaContent(String shangjiaContent) {
			this.shangjiaContent = shangjiaContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getShangjiaDelete() {
			return shangjiaDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShangjiaDelete(Integer shangjiaDelete) {
			this.shangjiaDelete = shangjiaDelete;
		}


	@Override
	public String toString() {
		return "MeishiView{" +
			", meishiValue=" + meishiValue +
			", shangxiaValue=" + shangxiaValue +
			", shangjiaName=" + shangjiaName +
			", shangjiaPhone=" + shangjiaPhone +
			", shangjiaEmail=" + shangjiaEmail +
			", shangjiaPhoto=" + shangjiaPhoto +
			", shangjiaAddress=" + shangjiaAddress +
			", newMoney=" + newMoney +
			", shangjiaContent=" + shangjiaContent +
			", shangjiaDelete=" + shangjiaDelete +
			"} " + super.toString();
	}
}
